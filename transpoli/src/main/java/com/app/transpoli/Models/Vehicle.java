package com.app.transpoli.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String placa;

	private String type;

	// Relación Uno a Muchos con Assignment
	@OneToMany(mappedBy = "vehicle")
	private List<Assignment> assignments;

	public long getId() {
		return id;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle(long id, String placa, String type, List<Assignment> assignments) {
		super();
		this.id = id;
		this.placa = placa;
		this.type = type;
		this.assignments = assignments;
	}

	public Vehicle(String placa, String type, List<Assignment> assignments) {
		super();
		this.placa = placa;
		this.type = type;
		this.assignments = assignments;
	}

	public Vehicle() {
		super();
	}

}
