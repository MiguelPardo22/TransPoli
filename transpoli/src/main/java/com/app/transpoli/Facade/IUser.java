package com.app.transpoli.Facade;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.transpoli.DTO.RegisterUserDTO;
import com.app.transpoli.Models.User;

public interface IUser extends UserDetailsService{

	public User save(RegisterUserDTO registerDTO);
}
