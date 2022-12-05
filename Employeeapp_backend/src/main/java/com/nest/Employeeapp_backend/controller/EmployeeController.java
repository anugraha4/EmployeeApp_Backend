package com.nest.Employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Employee App";
    }
    @PostMapping("/add")
    public String Add(){
        return "Employee adding page";
    }
    @PostMapping("/search")
    public String Search(){
        return "Search employees";
    }

    @PostMapping("/edit")
    public String Edit()
    {
        return "Edit employees";
    }
    @GetMapping("/view")
            public String Viewall()
    {
        return "view all employees";
    }
    @PostMapping("/delete")
    public String Delete(){
        return "delete employee";
    }
}
