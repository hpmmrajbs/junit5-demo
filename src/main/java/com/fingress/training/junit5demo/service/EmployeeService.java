package com.fingress.training.junit5demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fingress.training.junit5demo.api.EmployeeDataAdapter;
import com.fingress.training.junit5demo.domain.Employee;

public class EmployeeService {

    @Autowired
    EmployeeDataAdapter employeeAdapter;

    @Autowired
    Employee anEmployee;
    public Employee getEmployee(String name) {

        return employeeAdapter.getEmployee(name);

    }
    
}
