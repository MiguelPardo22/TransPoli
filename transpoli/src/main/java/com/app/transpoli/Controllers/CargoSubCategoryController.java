package com.app.transpoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.transpoli.Models.CargoSubCategory;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CargoSubCategoryController {

    /**
     * Método para obtener la vista con la lista de todas las subcategorías de carga.
     * 
     * @param model El modelo que se pasa a la vista con los datos de las subcategorías de carga.
     * @return El nombre de la vista para mostrar la lista de subcategorías de carga.
     */
    @GetMapping("/cargo-subcategories")
    public String CargoSubCategoriesView(Model model) {
        return "CargoSubCategoryView";
    }

    /**
     * Método para obtener la vista de una subcategoría de carga específica, filtrada por su ID.
     * 
     * @param id El identificador único de la subcategoría de carga que se desea consultar.
     * @param model El modelo que se pasa a la vista con los datos de la subcategoría de carga.
     * @return El nombre de la vista para mostrar los detalles de la subcategoría de carga.
     */
    @GetMapping("/cargo-subcategory/{id}")
    public String findCargoSubCategoryById(@PathVariable long id, Model model) {
        return "CargoSubCategoryDetailView";
    }

    /**
     * Método para obtener la vista para crear una nueva subcategoría de carga.
     * 
     * @param model El modelo que se pasa a la vista.
     * @return El nombre de la vista para crear una nueva subcategoría de carga.
     */
    @GetMapping("/cargo-subcategory/new")
    public String newCargoSubCategoryView(Model model) {
        return "NewCargoSubCategoryView";
    }

    /**
     * Método para guardar una nueva subcategoría de carga en el sistema.
     * 
     * @param cargoSubCategory El objeto CargoSubCategory que se va a guardar.
     * @return Redirecciona a la vista de la lista de subcategorías de carga después de guardar.
     */
    @PostMapping("/cargo-subcategory/save")
    public String saveCargoSubCategory(@ModelAttribute CargoSubCategory cargoSubCategory) {
        return "redirect:/cargo-subcategories";
    }

    /**
     * Método para obtener la vista para editar una subcategoría de carga existente.
     * 
     * @param id El identificador único de la subcategoría de carga que se desea editar.
     * @param model El modelo que se pasa a la vista con los datos de la subcategoría de carga a editar.
     * @return El nombre de la vista para editar la subcategoría de carga.
     */
    @GetMapping("/cargo-subcategory/edit/{id}")
    public String editCargoSubCategoryView(@PathVariable long id, Model model) {
        return "EditCargoSubCategoryView";
    }

    /**
     * Método para eliminar una subcategoría de carga del sistema.
     * 
     * @param id El identificador único de la subcategoría de carga que se desea eliminar.
     * @return Redirecciona a la vista de la lista de subcategorías de carga después de eliminar.
     */
    @GetMapping("/cargo-subcategory/delete/{id}")
    public String deleteCargoSubCategory(@PathVariable long id) {
        return "redirect:/cargo-subcategories";
    }
}
