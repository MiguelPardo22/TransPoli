package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.transpoli.Models.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
    


}
