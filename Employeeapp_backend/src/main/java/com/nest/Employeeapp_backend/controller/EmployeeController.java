package com.nest.Employeeapp_backend.controller;

import com.nest.Employeeapp_backend.dao.EmployeeDao;
import com.nest.Employeeapp_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Employee App";
    }

    @CrossOrigin(origins = "*")
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
        dao.save(e);
        return "Employee added successfully";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Employees> Search(@RequestBody Employees e){
        String empcode=String.valueOf(e.getEmpcd());
        System.out.println(empcode);
        return (List<Employees>) dao.SearchEmployee(e.getEmpcd());

    }


    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String Edit()
    {
        return "Edit employees";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
            public List<Employees> Viewall()
    {
        return (List<Employees>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String Delete(){
        return "delete employee";
    }
}
