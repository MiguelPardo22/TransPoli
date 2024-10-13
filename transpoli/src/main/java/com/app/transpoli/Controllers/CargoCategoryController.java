package com.app.transpoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CargoCategoryController {

	@GetMapping({"/cargo-categories"})
	public String CargoCategoriesView() {
		return "CargoCategoryView";
	}
	
}
