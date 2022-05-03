package com.gcu.cst323activities.business;

import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.data.service.PetDataService;
import com.gcu.cst323activities.model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetBusinessService {

    @Autowired
    private PetDataService service;

    public boolean create(PetModel pet) {
        PetEntity entity = new PetEntity();
        entity.setPet_name(pet.getPet_name());
        entity.setPet_species(pet.getPet_species());

        return service.create(entity);
    }

    public List<PetModel> getAllPets() {
        List<PetEntity> petEntities = service.findAll();
        List<PetModel> pets = new ArrayList<>();

        for (PetEntity pet : petEntities) {
            PetModel petModel = new PetModel();
            petModel.setPet_name(pet.getPet_name());
            petModel.setPet_species(pet.getPet_species());
            pets.add(petModel);
        }
        return pets;
    }
}
