package com.gcu.cst323activities.controller;

import com.gcu.cst323activities.business.PetBusinessService;
import com.gcu.cst323activities.model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UpdatePetController {

    @Autowired
    private PetBusinessService service;

    @GetMapping("/update/{id}")
    public String updatePet(@PathVariable("id") int id,  Model model)
    {
        System.out.println("The ID is : " + id);

        PetModel pet = service.findById(id);

        model.addAttribute("title", "CST-323 Activities - Update Pet");
        model.addAttribute("pet", pet);
        return "update-pet";
    }

    @PostMapping("/updatePetSubmit")
    public String updatePet(@ModelAttribute PetModel pet, Model model)
    {
        //////////////// TESTING
        /*System.out.println("The Pet Name is : " + pet.getPet_name());
        System.out.println("The Pet Species is : " + pet.getPet_species());*/

        if(service.update(pet))
        {
            List<PetModel> pets = service.getAllPets();
            model.addAttribute("title", "CST-323 Activity - Search");
            model.addAttribute("pets", pets);
        }
        return "search-pets";
    }
}
