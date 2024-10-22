package com.app.transpoli.Facade;

import java.util.List;
import com.app.transpoli.Models.Product;

public interface IProducts {

    /**
     * Recupera la lista de todos los productos disponibles.
     *
     * @return una Lista que contiene todos los productos.
     */
    public List<Product> productList();

    /**
     * Guarda el producto proporcionado. Si el producto ya existe, lo actualiza.
     *
     * @param product El producto que se va a guardar o actualizar.
     */
    public void saveProduct(Product product);

    /**
     * Elimina el producto proporcionado del sistema.
     *
     * @param product El producto que se va a eliminar.
     */
    public void deleteProduct(Product product);

    /**
     * Busca un producto por su identificador único (ID).
     *
     * @param id El identificador único del producto que se va a buscar.
     */
    public Product findByProduct(long id);
}
