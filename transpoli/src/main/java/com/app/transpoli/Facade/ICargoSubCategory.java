package com.app.transpoli.Facade;

import java.util.List;

import com.app.transpoli.Models.CargoSubCategory;

public interface ICargoSubCategory {
    /**
     * Metodo para listar todas las subcategorias de carga.
     * 
     * @return Retorna una lista de las subcategorias de carga.
     */
    public List<CargoSubCategory> cargoSubCategoriesList();

    /**
     * Metodo para buscar una categoria de carga por Id.
     * 
     * @param id Un numero entero que representa el id de la categoria.
     * 
     * @return Devuelve un objeto de tipo CargoSubCategory filtrado por el id.
     */
    public CargoSubCategory findBySubCargoCategory(long id);

    /**
     * Metodo para guardar un objeto de tipo CargoSubCategory.
     * 
     * @param cargoSubCategory El objeto de tipo CargoSubCategory a guardar.
     */
    public void save(CargoSubCategory cargoSubCategory);

    /**
     * Metodo para eliminar un objeto de tipo CargoSubCategory.
     * 
     * @param cargoSubCategory El objeto de tipo CargoSubCategory a eliminar.
     */
    public void delete(CargoSubCategory cargoSubCategory);
}
