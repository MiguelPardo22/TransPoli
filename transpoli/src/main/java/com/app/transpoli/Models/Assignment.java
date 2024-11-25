package com.app.transpoli.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignments")

public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String state;
	
	@ManyToOne
	@JoinColumn(name = "idDriver")
	private People idDriver;
	private long idInventory;

	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false) // Nombre de la columna de la clave foránea
	private Vehicle vehicle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	public People getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(People idDriver) {
		this.idDriver = idDriver;
	}

	public long getIdInventory() {
		return idInventory;
	}

	public void setIdInventory(long idInventory) {
		this.idInventory = idInventory;
	}

	public Assignment() {
		super();
	}

	public Assignment(long id, String state, People idDriver, long idInventory, Vehicle vehicle) {
		super();
		this.id = id;
		this.state = state;
		this.idDriver = idDriver;
		this.idInventory = idInventory;
		this.vehicle = vehicle;
	}

	
}
