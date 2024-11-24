package com.app.transpoli.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peoples")
@Inheritance(strategy = InheritanceType.JOINED) 
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "dni")
	private long dni;
	
	@Column(name = "names")
	private String names;
	
	@Column(name = "last_names")
	private String last_names;
	
	@Column(name = "phone")
	private long phone;
	
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private User user_id;
	
	@Column(name = "state")
	private String state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLast_names() {
		return last_names;
	}

	public void setLast_names(String last_names) {
		this.last_names = last_names;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public People() {
	}

	public People(long id, long dni, String names, String last_names, long phone, User user_id, String state) {
		this.id = id;
		this.dni = dni;
		this.names = names;
		this.last_names = last_names;
		this.phone = phone;
		this.user_id = user_id;
		this.state = state;
	}
	
}
