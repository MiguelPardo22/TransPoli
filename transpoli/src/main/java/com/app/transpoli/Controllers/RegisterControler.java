package com.app.transpoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterControler {

	@GetMapping("/login")
	public String initSesion() {
		return "/Views/Login";
	}
	
	@GetMapping("/")
	public String showLandingPage() {
		return "/Views/index";
	}
}
