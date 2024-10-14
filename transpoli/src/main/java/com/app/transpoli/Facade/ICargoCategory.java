package com.app.transpoli.Facade;

import java.util.List;

import com.app.transpoli.Models.CargoCategory;

public interface ICargoCategory {

    /** 
     * Metodo para listar todas las categorias de carga.
     *  
     * @return Retorna una lista de las categorias de carga.
     */
    public List<CargoCategory> cargoCategoriesList();
    
    /**
     * Metodo para buscar una categoria de carga por Id.
     * 
     * @param id Un numero entero que representa el id de la categoria.
     * 
     * @return Devuelve un objeto de tipo CargoCategory filtrado por el id.
     */
    public CargoCategory findByCargoCategory(long id);
    
    /** 
     * Metodo para guardar un objeto de tipo CargoCategory.
     * 
     * @param cargoCategory El objeto de tipo CargoCategory a guardar.
     */
    public void save(CargoCategory cargoCategory);
    
    /** 
     * Metodo para eliminar un objeto de tipo CargoCategory.
     * 
     * @param cargoCategory El objeto de tipo CargoCategory a eliminar.
     */
    public void delete(CargoCategory cargoCategory);
}
