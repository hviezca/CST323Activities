package com.gcu.cst323activities.data.repository;

import com.gcu.cst323activities.data.entity.PetEntity;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<PetEntity, Long>  {
}
