package com.app.transpoli.FacadeImp;

import com.app.transpoli.Facade.ICargoSubCategory;

import com.app.transpoli.Models.CargoSubCategory;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CargoSubCategoryService implements ICargoSubCategory {

    @Override
    public List<CargoSubCategory> cargoSubCategoriesList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cargoSubCategoriesList'");
    }

    @Override
    public CargoSubCategory findBySubCargoCategory(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySubCargoCategory'");
    }

    @Override
    public void save(CargoSubCategory cargoSubCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(CargoSubCategory cargoSubCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
