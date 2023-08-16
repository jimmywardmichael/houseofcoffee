package com.project.springcoffeeshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
    @GetMapping  ("/home")
    public String getGreeting(){
        return "html/coffeehome";
    }
}
