package com.app.transpoli.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "peoples")
@Inheritance(strategy = InheritanceType.JOINED) 
public class People {

}
