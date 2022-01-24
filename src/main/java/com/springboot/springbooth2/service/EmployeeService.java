package com.springboot.springbooth2.service;

import com.springboot.springbooth2.entity.Employee;
import com.springboot.springbooth2.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Value("${employee.employeeList.details}")
    private String stringList;


    public Employee map() {
        String[] tokens = stringList.split(",");
        Employee result = new Employee(Integer.parseInt(tokens[0]),
                tokens[1]);


        return result;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }


    public Employee createOrUpdateEmployee(Employee employee) {

            return employeeRepository.save(employee);

        }
    }



