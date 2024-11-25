package com.app.transpoli.Facade;

import java.util.List;

import com.app.transpoli.Models.Vehicle;

public interface IVehicule {
	Vehicle saveVehicle(Vehicle vehicle);

	Vehicle getVehicleById(Long id);

	List<Vehicle> getAllVehicles();

	Vehicle updateVehicle(Vehicle vehicle);

	void deleteVehicle(Long id);
}
