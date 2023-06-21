package com.cucumber.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cucumber.demo.services.DemoService;

@RestController
public class DemoController {

    @GetMapping
    String all() {

        return DemoService.getAllData().toString();
    }
    
}
