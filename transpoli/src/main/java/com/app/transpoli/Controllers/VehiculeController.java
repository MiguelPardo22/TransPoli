package com.app.transpoli.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.IPeople;
import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Vehicle;

@Controller
@RequestMapping({"/admin"})
@PreAuthorize("hasRole('ADMIN')")
public class VehiculeController {

	@Autowired
	IVehicule iVehicule;

	@Autowired
	IPeople iPeople;

	/**
	 * Método para obtener la vista con la lista de todos los vehículos.
	 *
	 * @param model El modelo que se pasa a la vista con los datos de los vehículos.
	 * @return El nombre de la vista para mostrar la lista de vehículos.
	 */
	@GetMapping("/vehicles")
	public String vehicleListView(Model model) {

		model.addAttribute("listPeople", iPeople.ListPeopleUser());
		model.addAttribute("listSensors", iVehicule.listSensors());

		return "Views/VehicleListView";
	}

	/**
	 * Método para obtener la lista de los Vehiculos registrados
	 *
	 * @return La lista de vehiculos registrados serializada a Json
	 */
	@GetMapping("/vehiclesList")
	@ResponseBody
	public Map<String, Object> vehicleListJson() {
		List<Vehicle> vehicles = iVehicule.vehicleList();

		Map<String, Object> response = new HashMap<>();
		response.put("data", vehicles);

		return response;
	}

	/**
	 * Método para buscar un vehículo específico, filtrado por su ID.
	 *
	 * @param id    El identificador único del vehículo que se desea consultar.
	 * @param model El modelo que se pasa a la vista con los datos del vehículo.
	 * @return El nombre de la vista para mostrar los detalles del vehículo.
	 */
	@GetMapping("/vehicle/{id}")
	public String findVehicleById(@PathVariable long id, Model model) {
		return "VehicleDetailView";
	}

	/**
	 * Método para guardar un nuevo vehículo en el sistema.
	 *
	 * @param vehicle El objeto Vehicle que se va a guardar.
	 * @return Redirecciona a la vista de la lista de vehículos después de guardar.
	 * @throws Exception
	 */
	@PostMapping("/vehicle/save")
	public String saveVehicle(@ModelAttribute Vehicle vehicle) throws Exception {

		try {
			iVehicule.save(vehicle);
		} catch (Exception e) {
			throw new Exception("¡Algo salió mal! " + e);
		}

		return "redirect:/admin/vehicles";
	}

	/**
     * Método para inactivar un vehículo existente.
     *
     * @param id El identificador único del vehículo que se desea inactivar.
     * @return Redirecciona a la vista de la lista de vehículos después de inactivar.
     */
    @GetMapping("/vehicle/inactivate/{id}")
    public String inactivateVehicle(@PathVariable long id) {
        
    	iVehicule.Inactivate(id);

        return "redirect:/admin/vehicles";
    }

	/**
	 * Método para obtener la posición actual de un vehículo.
	 *
	 * @param id    El identificador único del vehículo.
	 * @param model El modelo que se pasa a la vista con los datos del vehículo.
	 * @return El nombre de la vista para mostrar la posición del vehículo.
	 */
	@GetMapping("/vehicle/position/{id}")
	public String getVehiclePosition(@PathVariable long id, Model model) {
		return "VehiclePositionView";
	}

	/**
	 * Método para generar un reporte de alerta basado en las condiciones del
	 * sistema.
	 *
	 * @return Redirecciona a la vista de la lista de vehículos después de generar
	 *         el reporte.
	 */
	@GetMapping("/vehicle/alert-report")
	public String generateAlertReport() {
		return "redirect:/vehicles";
	}
}
