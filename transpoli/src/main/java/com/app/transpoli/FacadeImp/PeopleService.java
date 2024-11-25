package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.IPeople;
import com.app.transpoli.Models.People;
import com.app.transpoli.Repository.PeopleRepository;

@Service
public class PeopleService implements IPeople{

	@Autowired
	PeopleRepository repository;
	
    @Override
    public List<People> ListPeopleUser() {
        return repository.findAll();
    }

    @Override
    public People findByIdUser(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdUser'");
    }

    @Override
    public void savePeopleUser(People people) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savePeopleUser'");
    }

    @Override
    public void deletePeopleUser(People people) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePeopleUser'");
    }

    @Override
    public void InactivateUsers(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'InactivateUsers'");
    }
    
}
