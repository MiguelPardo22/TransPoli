package com.app.transpoli.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.IProducts;
import com.app.transpoli.Models.Product;

@Controller
public class ProductController {

    @Autowired
    IProducts iProducts;

    /**
     * Método para obtener la vista con la lista de todos los productos.
     *
     * @param model El modelo que se pasa a la vista con los datos de los productos.
     * @return El nombre de la vista para mostrar la lista de productos.
     */
    @GetMapping("/products")
    public String productListView(Model model) {
        return "ProductListView";
    }

    /**
     * Método para obtener la vista de un producto específico, filtrado por su ID.
     *
     * @param id El identificador único del producto que se desea consultar.
     * @param model El modelo que se pasa a la vista con los datos del producto.
     * @return El nombre de la vista para mostrar los detalles del producto.
     */
    @GetMapping("/product/{id}")
    public String findProductById(@PathVariable long id, Model model) {
        return "ProductDetailView";
    }

    /**
     * Método para obtener la vista para crear un nuevo producto.
     *
     * @param model El modelo que se pasa a la vista.
     * @return El nombre de la vista para crear un nuevo producto.
     */
    @GetMapping("/product/new")
    public String newProductView(Model model) {
        return "NewProductView";
    }

    /**
     * Método para guardar un nuevo producto en el sistema.
     *
     * @param product El objeto Product que se va a guardar.
     * @return Redirecciona a la vista de la lista de productos después de guardar.
     */
    @PostMapping("/product/save")
    public String saveProduct(@ModelAttribute Product product) {
        return "redirect:/products";
    }

    /**
     * Método para obtener la vista para editar un producto existente.
     *
     * @param id El identificador único del producto que se desea editar.
     * @param model El modelo que se pasa a la vista con los datos del producto a editar.
     * @return El nombre de la vista para editar el producto.
     */
    @GetMapping("/product/edit/{id}")
    public String editProductView(@PathVariable long id, Model model) {
        return "EditProductView";
    }

    /**
     * Método para eliminar un producto del sistema.
     *
     * @param id El identificador único del producto que se desea eliminar.
     * @return Redirecciona a la vista de la lista de productos después de eliminar.
     */
    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable long id) {
        return "redirect:/products";
    }
}
