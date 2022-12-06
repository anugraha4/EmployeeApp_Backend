package com.nest.Employeeapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {
    @Id
    @GeneratedValue
    private int id;
    private int empcd;
    private String empname;
    private String designation;
    private int salary;
    private String cmpname;
    private String mobno;
    private String username;
    private String password;

    public Employees() {
    }

    public Employees(int id, int empcd, String empname, String designation, int salary, String cmpname, String mobno, String username, String password) {
        this.id = id;
        this.empcd = empcd;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.cmpname = cmpname;
        this.mobno = mobno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcd() {
        return empcd;
    }

    public void setEmpcd(int empcd) {
        this.empcd = empcd;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCmpname() {
        return cmpname;
    }

    public void setCmpname(String cmpname) {
        this.cmpname = cmpname;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
