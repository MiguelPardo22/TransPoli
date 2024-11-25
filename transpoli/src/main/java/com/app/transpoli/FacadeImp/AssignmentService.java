package com.app.transpoli.FacadeImp;

import com.app.transpoli.Models.Assignment;
import com.app.transpoli.Repository.AssignmentRepository;
import com.app.transpoli.Facade.IAssignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService implements IAssignments {

	@Autowired
	private AssignmentRepository assignmentRepository;

	@Override
	public Assignment saveAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}

	@Override
	public Assignment getAssignmentById(Long id) {
		Optional<Assignment> optionalAssignment = assignmentRepository.findById(id);
		return optionalAssignment.orElse(null);
	}

	@Override
	public List<Assignment> getAllAssignments() {
		return assignmentRepository.findAll();
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		if (assignmentRepository.existsById(assignment.getId())) {
			return assignmentRepository.save(assignment);
		}
		return null;
	}

	@Override
	public void deleteAssignment(Long id) {
		assignmentRepository.deleteById(id);
	}
}
