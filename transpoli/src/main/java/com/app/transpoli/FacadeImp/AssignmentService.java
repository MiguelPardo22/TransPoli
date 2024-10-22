package com.app.transpoli.FacadeImp;

import java.util.List;

import com.app.transpoli.Facade.IAssignments;
import com.app.transpoli.Models.Assignment;

public class AssignmentService implements IAssignments{

    @Override
    public List<Assignment> assignmentList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignmentList'");
    }

    @Override
    public Assignment findByAssignment(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByAssignment'");
    }

    @Override
    public void saveAssignment(Assignment assignment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAssignment'");
    }

    @Override
    public void deleteAssignment(Assignment assignment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAssignment'");
    }

    @Override
    public boolean finishAssignment(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finishAssignment'");
    }

    @Override
    public boolean assignmentDriver(long idDriver, long idAssignment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignmentDriver'");
    }
    
}
