package com.app.transpoli.DTO;

public class RegisterUserDTO {

	private Long id;
	private String name;
	private String lastname;
	private String email;
	private String password;
	private String role;

	public Long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterUserDTO(Long id, String name, String lastname, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public RegisterUserDTO(String name, String lastname, String email, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public RegisterUserDTO(String email) {
		super();
		this.email = email;
	}

	public RegisterUserDTO() {
		super();
	}
}
