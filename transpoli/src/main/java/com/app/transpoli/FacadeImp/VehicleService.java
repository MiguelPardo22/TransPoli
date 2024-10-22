package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Vehicle;

@Service
public class VehicleService implements IVehicule{

    @Override
    public List<Vehicle> vehicleList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vehicleList'");
    }

    @Override
    public Vehicle findByIdVehicle(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdVehicle'");
    }

    @Override
    public void save(Vehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void Inactivate(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Inactivate'");
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

    
}