package com.fingress.training.junit5demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpServerErrorException.NotImplemented;

import com.fingress.training.junit5demo.domain.Employee;

public class EmployeeDataAdapter {

    @Autowired
    Employee anEmployee;
    @Autowired
    List<Employee> employeeList;

    public void getEmployeeLists() throws NotImplemented {

    }

    public Employee getEmployee(String name) {

        anEmployee.setName("Muthuraj");
        anEmployee.setAge(45);
        anEmployee.setGender("Male");

        return this.anEmployee;

    }

    public void addEmployee() throws NotImplemented {

    }
    
}
