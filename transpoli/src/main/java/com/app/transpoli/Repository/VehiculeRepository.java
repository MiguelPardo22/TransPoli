package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.transpoli.Models.Vehicle;

public interface VehiculeRepository extends JpaRepository<Vehicle, Long> {
    
}
