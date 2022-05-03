package com.gcu.cst323activities.controller;

import com.gcu.cst323activities.business.PetBusinessService;
import com.gcu.cst323activities.model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddPetController {

    @Autowired
    private PetBusinessService service;

    @GetMapping("/addpet")
    public String addPetForm(Model model)
    {
        model.addAttribute("title", "CST-323 Actiivities - Add Pet");
        model.addAttribute("pet", new PetModel());
        return "add-pet";
    }

    @PostMapping("/addPetSubmit")
    public String createPet(@ModelAttribute PetModel pet)
    {
        //////////////// TESTING
        /*System.out.println("The Pet Name is : " + pet.getPet_name());
        System.out.println("The Pet Species is : " + pet.getPet_species());*/

        if(service.create(pet))
            return "index";

        return null;
    }
}
