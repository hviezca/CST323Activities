package com.gcu.cst323activities.controller;

import com.gcu.cst323activities.business.PetBusinessService;
import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchPetsController {

    @Autowired
    private PetBusinessService service;

    @GetMapping("/searchpets")
    public String searchPets(Model model)
    {
        ///////////////// TESTING
        /*List<PetModel> pets = new ArrayList<>();
        pets.add(new PetModel(1, "Sherlock", "Cat"));
        pets.add(new PetModel(1, "Watson", "Cat"));
        pets.add(new PetModel(1, "Meep-Meep", "Cat"));*/

        List<PetModel> pets = service.getAllPets();
        model.addAttribute("title", "CST-323 Activity - Search");
        model.addAttribute("pets", pets);
        return "search-pets";
    }
}
