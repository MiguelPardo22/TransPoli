package com.app.transpoli.FacadeImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Vehicle;
import com.app.transpoli.Repository.VehiculeRepository;

@Service
public class VehicleService implements IVehicule {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	@Override
	public Vehicle saveVehicle(Vehicle Vehicle) {
		return vehiculeRepository.save(Vehicle);
	}

	@Override
	public Vehicle getVehicleById(Long id) {
		Optional<Vehicle> optionalVehicle = vehiculeRepository.findById(id);
		return optionalVehicle.orElse(null);
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicle updateVehicle(Vehicle Vehicle) {
		if (vehiculeRepository.existsById(Vehicle.getId())) {
			return vehiculeRepository.save(Vehicle);
		}
		return null;
	}

	@Override
	public void deleteVehicle(Long id) {
		vehiculeRepository.deleteById(id);
	}

}