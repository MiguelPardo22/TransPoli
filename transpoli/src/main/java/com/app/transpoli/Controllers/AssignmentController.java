package com.app.transpoli.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.transpoli.Facade.IAssignments;
import com.app.transpoli.Facade.IPeople;
import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Assignment;

@Controller
@RequestMapping("/assignments")
@PreAuthorize("hasRole('ADMIN')")
public class AssignmentController {

	@Autowired
	private IAssignments assignmentService;

	@Autowired
	private IVehicule vehicleService;

	@Autowired
	private IPeople peopleService;
	
	@GetMapping
	public String listAssignments(Model model) {

		model.addAttribute("assignments", assignmentService.getAllAssignments());
		model.addAttribute("listPeople", peopleService.ListPeopleUser());
		model.addAttribute("assignment", new Assignment()); // Objeto vacío para el formulario de creación
		model.addAttribute("vehicles", vehicleService.getAllVehicles()); // Lista de vehículos para el desplegable

		return "Views/Assignment"; // Vista única para lista, creación y edición
	}

	// Guardar o actualizar Assignment
	@PostMapping("/save")
	public String saveOrUpdateAssignment(@ModelAttribute Assignment assignment) {
		assignmentService.saveAssignment(assignment);
		return "redirect:/assignments"; // Redirige al listado después de guardar
	}

	// Cargar Assignment para edición
	@GetMapping("/edit/{id}")
	public String editAssignment(@PathVariable("id") Long id, Model model) {
		Assignment assignment = assignmentService.getAssignmentById(id);
		model.addAttribute("assignment", assignment);
		model.addAttribute("assignments", assignmentService.getAllAssignments()); // Para mostrar lista actualizada
		model.addAttribute("vehicles", vehicleService.getAllVehicles()); // Para el desplegable de vehículos

		return "Views/Assignment"; // Muestra la misma vista, pero con el formulario rellenado
	}
	
	@GetMapping("/assignmentsList")
	@ResponseBody
	public Map<String, Object> vehicleListJson() {
		List<Assignment> vehicles = assignmentService.getAllAssignments();

		Map<String, Object> response = new HashMap<>();
		response.put("data", vehicles);

		return response;
	}
}
