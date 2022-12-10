package com.nest.Employeeapp_backend.dao;

import com.nest.Employeeapp_backend.model.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {

    @Query(value = "SELECT `id`, `cmpname`, `designation`, `empcd`, `empname`, `mobno`, `password`, `salary`, `username` FROM `employees` WHERE `empcd`=:empcode%",nativeQuery = true)
    List<Employees> SearchEmployee(@Param("empcode") Integer empcode);
}
