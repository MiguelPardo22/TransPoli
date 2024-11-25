package com.app.transpoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/403")
    public String accessDenied() {
        return "Views/403"; // Nombre de la vista HTML personalizada para el error 403
    }
    
    @GetMapping("/index")
    public String landingPage() {
        return "Views/index"; // Nombre de la vista HTML personalizada para el index
    }
}
