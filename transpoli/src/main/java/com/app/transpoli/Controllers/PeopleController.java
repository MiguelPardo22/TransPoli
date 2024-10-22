package com.app.transpoli.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.IPeople;
import com.app.transpoli.Models.People;

@Controller
public class PeopleController {

    @Autowired
    IPeople iPeople;

    /**
     * Método para obtener la vista con la lista de todos los usuarios.
     *
     * @param model El modelo que se pasa a la vista con los datos de los usuarios.
     * @return El nombre de la vista para mostrar la lista de usuarios.
     */
    @GetMapping("/people")
    public String peopleListView(Model model) {
        return "PeopleListView";
    }

    /**
     * Método para buscar un usuario específico, filtrado por su ID.
     *
     * @param id El identificador único del usuario que se desea consultar.
     * @param model El modelo que se pasa a la vista con los datos del usuario.
     * @return El nombre de la vista para mostrar los detalles del usuario.
     */
    @GetMapping("/people/{id}")
    public String findUserById(@PathVariable long id, Model model) {
        return "PeopleDetailView";
    }

    /**
     * Método para obtener la vista para crear un nuevo usuario.
     *
     * @param model El modelo que se pasa a la vista.
     * @return El nombre de la vista para crear un nuevo usuario.
     */
    @GetMapping("/people/new")
    public String newUserView(Model model) {
        return "NewPeopleView";
    }

    /**
     * Método para guardar un nuevo usuario en el sistema.
     *
     * @param people El objeto People que se va a guardar.
     * @return Redirecciona a la vista de la lista de usuarios después de guardar.
     */
    @PostMapping("/people/save")
    public String saveUser(@ModelAttribute People people) {
        return "redirect:/people";
    }

    /**
     * Método para inactivar un usuario existente.
     *
     * @param id El identificador único del usuario que se desea inactivar.
     * @return Redirecciona a la vista de la lista de usuarios después de inactivar.
     */
    @GetMapping("/people/inactivate/{id}")
    public String inactivateUser(@PathVariable long id) {
        return "redirect:/people";
    }

    /**
     * Método para eliminar un usuario del sistema.
     *
     * @param id El identificador único del usuario que se desea eliminar.
     * @return Redirecciona a la vista de la lista de usuarios después de eliminar.
     */
    @GetMapping("/people/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        return "redirect:/people";
    }
}
