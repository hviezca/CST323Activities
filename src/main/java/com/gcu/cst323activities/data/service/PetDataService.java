package com.gcu.cst323activities.data.service;

import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.data.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetDataService implements DataAccessInterface<PetEntity> {

    @Autowired
    private PetRepository repository;

    @Override
    public List<PetEntity> findAll() {

        return (List<PetEntity>) repository.findAll();
    }

    @Override
    public PetEntity findById(int id) {
        return null;
    }

    @Override
    public boolean create(PetEntity pet) {

        repository.save(pet);
        return true;
    }

    @Override
    public boolean update(PetEntity petModel) {
        return false;
    }

    @Override
    public boolean delete(PetEntity petModel) {
        return false;
    }
}
