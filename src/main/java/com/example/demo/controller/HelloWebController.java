package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.RestController;
//@RestController

@Controller

public class HelloWebController {

    @GetMapping("/sk")
    public String HelloWorld() {
        return "Hello from SK";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message","Im an Indian");
        return "message";
    }
}

