package com.app.transpoli.FacadeImp;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.transpoli.DTO.RegisterUserDTO;
import com.app.transpoli.Facade.IUser;
import com.app.transpoli.Models.Role;
import com.app.transpoli.Models.User;
import com.app.transpoli.Repository.UserRepository;

@Service
public class UserService implements IUser {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(RegisterUserDTO registerDTO) {
		User user = new User(registerDTO.getName(), registerDTO.getLastname(), registerDTO.getEmail(),
				passwordEncoder.encode(registerDTO.getPassword()), Arrays.asList(new Role("ADMIN")));

		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("Usuario no Valido");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				choiseRoleAuthorities(user.getRoles()));
	}
 
	private Collection<? extends GrantedAuthority> choiseRoleAuthorities(Collection<Role> roles) {

		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

}
