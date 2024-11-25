package com.app.transpoli.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.transpoli.Facade.IVehicule;
import com.app.transpoli.Models.Vehicle;

@Controller
@RequestMapping("/vehicle")
public class VehiculeController {

    @Autowired
    IVehicule iVehicule;

    // Mostrar lista de vehículos y formulario en la misma vista
    @GetMapping
    public String listVehicles(Model model) {
        model.addAttribute("vehicles", iVehicule.getAllVehicles());
        model.addAttribute("vehicle", new Vehicle()); // Objeto vacío para el formulario de creación
        return "Views/Vehicule"; // Vista única para lista, creación y edición
    }

    // Guardar o actualizar Vehicle
    @PostMapping("/save")
    public String saveOrUpdateVehicle(@ModelAttribute Vehicle vehicle) {
        iVehicule.saveVehicle(vehicle);
        return "redirect:/vehicle"; // Redirige al listado después de guardar
    }

    // Cargar Vehicle para edición
    @GetMapping("/edit/{id}")
    public String editVehicle(@PathVariable("id") Long id, Model model) {
        Vehicle vehicle = iVehicule.getVehicleById(id);
        model.addAttribute("vehicle", vehicle);
        model.addAttribute("vehicles", iVehicule.getAllVehicles()); // Para mostrar lista actualizada
        return "Views/Vehicule"; // Muestra la misma vista, pero con el formulario rellenado
    }
}
