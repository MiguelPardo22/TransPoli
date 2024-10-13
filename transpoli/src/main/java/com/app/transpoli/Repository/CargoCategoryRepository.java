package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.CargoCategory;

@Repository
public interface CargoCategoryRepository extends JpaRepository<CargoCategory, Long>{

}
