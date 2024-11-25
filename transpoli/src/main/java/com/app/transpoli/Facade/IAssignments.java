package com.app.transpoli.Facade;

import com.app.transpoli.Models.Assignment;
import java.util.List;

public interface IAssignments {
    Assignment saveAssignment(Assignment assignment);
    Assignment getAssignmentById(Long id);
    List<Assignment> getAllAssignments();
    Assignment updateAssignment(Assignment assignment);
    void deleteAssignment(Long id);
}
