package com.gcu.cst323activities.data.service;

import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.data.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<PetEntity> entity = repository.findById((long) id);
        return entity.get();
    }

    @Override
    public boolean create(PetEntity pet) {

        repository.save(pet);
        return true;
    }

    @Override
    public boolean update(PetEntity entity) {

        repository.save(entity);
        return true;
    }

    @Override
    public boolean delete(PetEntity entity)
    {
        repository.delete(entity);
        return true;
    }
}
