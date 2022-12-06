package com.nest.Employeeapp_backend.controller;

import com.nest.Employeeapp_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Employee App";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Employees e)
    {
        System.out.println(e.getEmpcd());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCmpname().toString());
        System.out.println(e.getMobno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "Employee added successfully";
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
