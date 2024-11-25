package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.Vehicle;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicle, Long> {
    
}
