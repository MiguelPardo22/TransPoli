package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.CargoSubCategory;

@Repository
public interface CargoSubCategoryRepository extends JpaRepository<CargoSubCategory, Long>{

}
