package com.crm.customer_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
@Controller
public class ProductController {

    @GetMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("view","views/newProduct.html");
        return "views/home";
    }

    public String save(Model model){

        model.addAttribute("view","views/newProduct.html");
        return "views/home";
    }

}
