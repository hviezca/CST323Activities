package com.gcu.cst323activities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpdatePetController {

    @GetMapping("/update")
    public String updatePet(Model model)
    {
        model.addAttribute("title", "CST-323 Activities - Update Pet");
        return null;
    }
}
