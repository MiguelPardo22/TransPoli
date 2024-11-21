package com.app.transpoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.transpoli.DTO.RegisterUserDTO;
import com.app.transpoli.Facade.IUser;

@Controller
@RequestMapping("/register")
public class UserRegisterController {

	private IUser iUser;

	public UserRegisterController(IUser iUser) {
		super();
		this.iUser = iUser;
	}

	@ModelAttribute("user")
	public RegisterUserDTO returnNewUserDTO() {
		return new RegisterUserDTO();
	}

	@GetMapping
	public String showRegisterForm() {
		return "/Views/Register";
	}

	@PostMapping
	public String registerAccountUser(@ModelAttribute("user") RegisterUserDTO registerDTO) {
		iUser.save(registerDTO);
		return "redirect:/register?success";
	}

}
