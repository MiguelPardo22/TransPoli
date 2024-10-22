package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long>{
    
}
