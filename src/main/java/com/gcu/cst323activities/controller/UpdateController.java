package com.gcu.cst323activities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UpdateController {

    @GetMapping("/update/{id}")
    public String updatePet(@PathVariable("id") int id)
    {
        System.out.println("The ID is : " + id);
        return null;
    }
}
