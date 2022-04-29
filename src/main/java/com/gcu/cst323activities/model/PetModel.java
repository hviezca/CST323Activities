package com.gcu.cst323activities.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;

public class PetModel {

    @Id
    private long id;

    @NotEmpty(message="Please enter a pet name")
    private String pet_name;

    @NotEmpty(message = "Please enter a pet species")
    private String pet_species;

    public PetModel() {}

    public PetModel(long id, String pet_name, String pet_species) {
        this.id = id;
        this.pet_name = pet_name;
        this.pet_species = pet_species;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_species() {
        return pet_species;
    }

    public void setPet_species(String pet_species) {
        this.pet_species = pet_species;
    }
}
