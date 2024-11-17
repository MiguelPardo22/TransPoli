package com.app.transpoli.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.ICargoCategory;
import com.app.transpoli.Models.CargoCategory;

@Controller
public class CargoCategoryController {

    @Autowired
    ICargoCategory iCargoCategory;
    
    /**
     * Metodo para obtener la vista de la lista de las Categorias de carga.
     * 
     * @param model El modelo que se pasa a la vista.
     * @return Retorna el nombre de la vista para mostrar las categorias de carga.
     */
    @GetMapping("/cargo-categories")
    public String CargoCategoriesView(Model model) {
        return "Views/CargoCategoryView";
    }
    
    /**
     * Metodo para obtener la vista de una categoria de carga filtrada por su id.
     * 
     * @param id El id de la categoria de carga que se desea buscar.
     * @param model El modelo que se pasa a la vista.
     * @return Retorna el nombre de la vista para mostrar la categoria de carga específica.
     */
    @GetMapping("/cargo-category/{id}")
    public String findCargoCategoryById(@PathVariable long id, Model model) {
        return "CargoCategoryDetailView";
    }
    
    /**
     * Metodo para obtener la vista para crear una nueva categoria de carga.
     * 
     * @param model El modelo que se pasa a la vista.
     * @return Retorna el nombre de la vista para crear una nueva categoria de carga.
     */
    @GetMapping("/cargo-category/new")
    public String newCargoCategoryView(Model model) {
        return "NewCargoCategoryView";
    }
    
    /**
     * Metodo para guardar una nueva categoria de carga.
     * 
     * @param cargoCategory El objeto de tipo CargoCategory que se va a guardar.
     * @return Retorna una redirección a la vista de lista de categorias de carga.
     */
    @PostMapping("/cargo-category/save")
    public String saveCargoCategory(@ModelAttribute CargoCategory cargoCategory) {
        return "redirect:/cargo-categories";
    }
    
    /**
     * Metodo para obtener la vista para editar una categoria de carga existente.
     * 
     * @param id El id de la categoria de carga que se desea editar.
     * @param model El modelo que se pasa a la vista.
     * @return Retorna el nombre de la vista para editar la categoria de carga.
     */
    @GetMapping("/cargo-category/edit/{id}")
    public String editCargoCategoryView(@PathVariable long id, Model model) {
        return "EditCargoCategoryView";
    }
    
    /**
     * Metodo para eliminar una categoria de carga.
     * 
     * @param id El id de la categoria de carga que se desea eliminar.
     * @return Retorna una redirección a la vista de lista de categorias de carga.
     */
    @GetMapping("/cargo-category/delete/{id}")
    public String deleteCargoCategory(@PathVariable long id) {
        return "redirect:/cargo-categories";
    }
}
