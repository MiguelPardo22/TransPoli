package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.ICargoCategory;
import com.app.transpoli.Models.CargoCategory;

@Service
public class CargoCategoryService implements ICargoCategory{

	@Override
	public List<CargoCategory> cargoCategoriesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CargoCategory findByCargoCategory(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CargoCategory cargoCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CargoCategory cargoCategory) {
		// TODO Auto-generated method stub
		
	}

}
