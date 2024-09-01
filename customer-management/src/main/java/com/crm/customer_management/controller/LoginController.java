package com.crm.customer_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "views/login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("view", "views/dashboard");
        return "views/home";  // Returning the home template
    }


}
