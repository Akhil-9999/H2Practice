package com.springboot.springbooth2.controller;

import com.springboot.springbooth2.entity.Employee;
import com.springboot.springbooth2.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
    public Employee createOrUpdateEmployee(Employee employee) {


        return employeeService.createOrUpdateEmployee(employee);





    }

    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }

}