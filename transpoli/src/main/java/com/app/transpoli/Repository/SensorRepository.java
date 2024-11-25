package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>{

}
