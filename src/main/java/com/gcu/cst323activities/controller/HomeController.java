package com.gcu.cst323activities.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String home(Model model)
    {
        logger.info("Entering HomeController.home(). Welcome!");
        model.addAttribute("title", "CST-323 Activities - Home");
        return "index";
    }
}
