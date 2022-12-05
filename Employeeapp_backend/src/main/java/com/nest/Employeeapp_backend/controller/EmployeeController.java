package com.nest.Employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Employee App";
    }
    @GetMapping("/add")
    public String Add(){
        return "Employee adding page";
    }
    @GetMapping("/search")
    public String Search(){
        return "Search employees";
    }
}
