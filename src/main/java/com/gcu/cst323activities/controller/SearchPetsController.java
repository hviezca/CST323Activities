package com.gcu.cst323activities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchPetsController {

    @GetMapping("/searchpets")
    public String searchPets(Model model)
    {
        model.addAttribute("title", "CST-323 Activity - Search");
        return "search-pets";
    }
}
