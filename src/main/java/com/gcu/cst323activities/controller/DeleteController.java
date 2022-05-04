package com.gcu.cst323activities.controller;

import com.gcu.cst323activities.business.PetBusinessService;
import com.gcu.cst323activities.model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class DeleteController {

    @Autowired
    private PetBusinessService service;

    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") int id,  Model model)
    {
        if(service.deleteById(id)) {
            List<PetModel> pets = service.getAllPets();
            model.addAttribute("title", "CST-323 Activity - Search");
            model.addAttribute("pets", pets);
        }
        return "search-pets";
    }
}
