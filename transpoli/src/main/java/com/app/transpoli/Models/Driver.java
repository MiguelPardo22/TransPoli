package com.app.transpoli.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Driver extends People {

	@Column(name = "Vehicle_id")
	private int vehicle_id;

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	
	public Driver() {
		super();
	}

	public Driver(int vehicle_id) {
		super();
		this.vehicle_id = vehicle_id;
	}
	
}
