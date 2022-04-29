package com.gcu.cst323activities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddPetController {

    @GetMapping("/addpet")
    public String addPet(Model model)
    {
        model.addAttribute("title", "CST-323 Actiivities - Add Pet");
        return "add-pet";
    }
}
