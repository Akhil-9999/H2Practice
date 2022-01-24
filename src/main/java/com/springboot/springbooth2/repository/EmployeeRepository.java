package com.springboot.springbooth2.repository;

import com.springboot.springbooth2.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
