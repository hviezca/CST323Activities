package com.gcu.cst323activities.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("pets")
public class PetEntity {

    @Id
    @Column("id")
    private long id;

    @Column("pet_name")
    private String pet_name;

    @Column("pet_species")
    private String pet_species;

    public PetEntity() {}

    public PetEntity(long id, String pet_name, String pet_species) {
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
