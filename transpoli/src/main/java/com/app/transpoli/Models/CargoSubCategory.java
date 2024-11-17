package com.app.transpoli.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargo_subcategories")
public class CargoSubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
