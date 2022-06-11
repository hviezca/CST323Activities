package com.gcu.cst323activities.data.service;

import com.gcu.cst323activities.controller.UpdatePetController;
import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.data.repository.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetDataService implements DataAccessInterface<PetEntity> {

    @Autowired
    private PetRepository repository;

    Logger logger = LoggerFactory.getLogger(UpdatePetController.class);

    @Override
    public List<PetEntity> findAll() {
        logger.info("Entering PetDataService.findAll()");
        try{
            List<PetEntity> pets = (List<PetEntity>) repository.findAll();
            logger.info("Found all pets in DB!");
            return pets;
        }
        catch (Exception e){
            logger.error("No pets found in DB ... Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PetEntity findById(int id) {
        logger.info("Entering PetDataService.findByID(). ID = " + id);
        try {
            Optional<PetEntity> entity = repository.findById((long) id);
            PetEntity pet = entity.get();
            logger.info("Pet found in DB! Pet Name = " + pet.getPet_name() + " Pet Species = " + pet.getPet_species());
            return pet;
        } catch (Exception e) {
            logger.error("Pet not found in DB ... Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean create(PetEntity pet) {
        logger.info("Entering PetDataService.create()");
        try {
            repository.save(pet);
            logger.info("Pet created in DB successfully! Pet Name = " + pet.getPet_name() + " Pet Species = " + pet.getPet_species());
            return true;
        } catch (Exception e) {
            logger.error("Pet not created in DB ... Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(PetEntity entity) {
        logger.info("Entering PetDataService.update()");
        try {
            repository.save(entity);
            logger.info("Pet updated in DB successfully! Pet Name = " + entity.getPet_name() + " Pet Species = " + entity.getPet_species());
            return true;
        } catch (Exception e) {
            logger.error("Pet not updated in DB ... Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(PetEntity entity)
    {
        logger.info("Entering PetDataService.delete()");
        try {
            repository.delete(entity);
            logger.info("Pet deleted in DB successfully! Deleted Pet ID = " + entity.getId());
            return true;
        } catch (Exception e) {
            logger.error("Pet not deleted from DB... Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
