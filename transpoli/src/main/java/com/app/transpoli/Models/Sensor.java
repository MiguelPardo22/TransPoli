package com.app.transpoli.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sensors")
public class Sensor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "length")
	private Double length;
	
	@Column(name = "velocity")
	private Double velocity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getVelocity() {
		return velocity;
	}

	public void setVelocity(Double velocity) {
		this.velocity = velocity;
	}

	public Sensor() {
	}

	public Sensor(long id, String name, Double latitude, Double length, Double velocity) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.length = length;
		this.velocity = velocity;
	}
	
}
