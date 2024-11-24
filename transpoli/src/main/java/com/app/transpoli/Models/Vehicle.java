package com.app.transpoli.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "plate")
	private String plate;
	
	@Column(name = "mileage")
	private String mileage;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "type_vehicule")
	private String type_vehicule;
	
	@Column(name = "load_capacity")
	private float load_capacity;
	
	@ManyToOne
	@JoinColumn(name="person_id", referencedColumnName = "id")
	private Driver person_id; 
	
	@ManyToOne
	@JoinColumn(name="sensor_id", referencedColumnName = "id")
	private Sensor sensor_id; 
	
	@Column(name = "state")
	private String state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType_vehicule() {
		return type_vehicule;
	}

	public void setType_vehicule(String type_vehicule) {
		this.type_vehicule = type_vehicule;
	}

	public float getLoad_capacity() {
		return load_capacity;
	}

	public void setLoad_capacity(float load_capacity) {
		this.load_capacity = load_capacity;
	}

	public People getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Driver person_id) {
		this.person_id = person_id;
	}

	public Sensor getSensor_id() {
		return sensor_id;
	}

	public void setSensor_id(Sensor sensor_id) {
		this.sensor_id = sensor_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Vehicle() {
	}

	public Vehicle(long id, String plate, String mileage, String model, String type_vehicule, float load_capacity,
			Driver person_id, Sensor sensor_id, String state) {
		this.id = id;
		this.plate = plate;
		this.mileage = mileage;
		this.model = model;
		this.type_vehicule = type_vehicule;
		this.load_capacity = load_capacity;
		this.person_id = person_id;
		this.sensor_id = sensor_id;
		this.state = state;
	}
		
}
