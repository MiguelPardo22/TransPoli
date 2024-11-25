package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Sensor;
import com.app.transpoli.Models.Vehicle;
import com.app.transpoli.Repository.SensorRepository;
import com.app.transpoli.Repository.VehiculeRepository;

@Service
public class VehicleService implements IVehicule{

	@Autowired
	VehiculeRepository repository;
	
	@Autowired
	SensorRepository sensorRepository;
	
    @Override
    public List<Vehicle> vehicleList() {
        return repository.findAll();
    }

    @Override
    public Vehicle findByIdVehicle(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdVehicle'");
    }

    @Override
    public void save(Vehicle vehicle) {
        repository.save(vehicle);
    }

    @Override
    public void Inactivate(long id) {
        
        Vehicle vehicle = repository.findById(id).orElse(null);
        
        if (vehicle != null) {
            
            vehicle.setState("Inactivo");
            repository.save(vehicle);
        } else {
            throw new IllegalArgumentException("Vehículo no encontrado con el ID: " + id);
        }
    }

    @Override
    public Vehicle getPositionVehicle(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPositionVehicle'");
    }

    @Override
    public boolean alertReport() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alertReport'");
    }

	@Override
	public List<Sensor> listSensors() {
		return sensorRepository.findAll();
	}

    
}