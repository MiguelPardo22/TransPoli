package com.app.transpoli.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Vehicle;

@Controller
public class VehiculeController {

    @Autowired
    IVehicule iVehicule;

    /**
     * Método para obtener la vista con la lista de todos los vehículos.
     *
     * @param model El modelo que se pasa a la vista con los datos de los vehículos.
     * @return El nombre de la vista para mostrar la lista de vehículos.
     */
    @GetMapping("/vehicles")
    public String vehicleListView(Model model) {
        return "VehicleListView";
    }

    /**
     * Método para buscar un vehículo específico, filtrado por su ID.
     *
     * @param id El identificador único del vehículo que se desea consultar.
     * @param model El modelo que se pasa a la vista con los datos del vehículo.
     * @return El nombre de la vista para mostrar los detalles del vehículo.
     */
    @GetMapping("/vehicle/{id}")
    public String findVehicleById(@PathVariable long id, Model model) {
        return "VehicleDetailView";
    }

    /**
     * Método para obtener la vista para crear un nuevo vehículo.
     *
     * @param model El modelo que se pasa a la vista.
     * @return El nombre de la vista para crear un nuevo vehículo.
     */
    @GetMapping("/vehicle/new")
    public String newVehicleView(Model model) {
        return "NewVehicleView";
    }

    /**
     * Método para guardar un nuevo vehículo en el sistema.
     *
     * @param vehicle El objeto Vehicle que se va a guardar.
     * @return Redirecciona a la vista de la lista de vehículos después de guardar.
     */
    @PostMapping("/vehicle/save")
    public String saveVehicle(@ModelAttribute Vehicle vehicle) {
        return "redirect:/vehicles";
    }

    /**
     * Método para inactivar un vehículo existente.
     *
     * @param id El identificador único del vehículo que se desea inactivar.
     * @return Redirecciona a la vista de la lista de vehículos después de inactivar.
     */
    @GetMapping("/vehicle/inactivate/{id}")
    public String inactivateVehicle(@PathVariable long id) {
        return "redirect:/vehicles";
    }

    /**
     * Método para obtener la posición actual de un vehículo.
     *
     * @param id El identificador único del vehículo.
     * @param model El modelo que se pasa a la vista con los datos del vehículo.
     * @return El nombre de la vista para mostrar la posición del vehículo.
     */
    @GetMapping("/vehicle/position/{id}")
    public String getVehiclePosition(@PathVariable long id, Model model) {
        return "VehiclePositionView";
    }

    /**
     * Método para generar un reporte de alerta basado en las condiciones del sistema.
     *
     * @return Redirecciona a la vista de la lista de vehículos después de generar el reporte.
     */
    @GetMapping("/vehicle/alert-report")
    public String generateAlertReport() {
        return "redirect:/vehicles";
    }
}
