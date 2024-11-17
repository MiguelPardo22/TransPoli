package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.ICargoCategory;
import com.app.transpoli.Models.CargoCategory;
import com.app.transpoli.Repository.CargoCategoryRepository;

@Service
public class CargoCategoryService implements ICargoCategory{

	@Autowired
	CargoCategoryRepository repository;
	
	@Override
	public List<CargoCategory> cargoCategoriesList() {
		return repository.findAll();
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
