package com.gcu.cst323activities.controller;

import com.gcu.cst323activities.business.PetBusinessService;
import com.gcu.cst323activities.data.entity.PetEntity;
import com.gcu.cst323activities.model.PetModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/searchpets")
    public String searchPets(Model model)
    {
        logger.info("Entering SearchPetsController.searchPets()");
        List<PetModel> pets = service.getAllPets();
        if(!pets.isEmpty())
        {
            model.addAttribute("title", "CST-323 Activity - Search");
            model.addAttribute("pets", pets);
        }

        return "search-pets";
    }
}
