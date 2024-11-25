package com.app.transpoli.Facade;

import java.util.List;

import com.app.transpoli.Models.Sensor;
import com.app.transpoli.Models.Vehicle;

public interface IVehicule {

    /**
     * Recupera la lista de todos los vehículos disponibles.
     *
     * @return una Lista que contiene todos los vehículos.
     */
    public List<Vehicle> vehicleList();

    /**
     * Busca un vehículo por su identificador único (ID).
     *
     * @param id El identificador único del vehículo que se desea buscar.
     * @return El vehículo encontrado con el ID especificado.
     */
    public Vehicle findByIdVehicle(long id);

    /**
     * Guarda el vehículo proporcionado. Si el vehículo ya existe, lo actualiza.
     *
     * @param vehicle El vehículo que se va a guardar o actualizar.
     */
    public void save(Vehicle vehicle);

    /**
     * Inactiva el vehículo identificado por el ID proporcionado.
     *
     * @param id El identificador único del vehículo que se va a inactivar.
     */
    public void Inactivate(long id);

    /**
     * Obtiene la posición actual de un vehículo identificado por su ID.
     *
     * @param id El identificador único del vehículo.
     * @return El vehículo con su posición actual.
     */
    public Vehicle getPositionVehicle(long id);

    /**
     * Genera un reporte de alerta basado en las condiciones del sistema.
     *
     * @return true si se ha generado una alerta, false en caso contrario.
     */
    public boolean alertReport();
    
    /**
     * Genera una lista de los sensores registrados
     *
     * @return Retorna una lista de los sensores registrados
     * 
     */
    public List<Sensor> listSensors();
    
}
