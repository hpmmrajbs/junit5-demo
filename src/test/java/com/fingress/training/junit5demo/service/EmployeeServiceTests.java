package com.fingress.training.junit5demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.fingress.training.junit5demo.api.EmployeeDataAdapter;
import com.fingress.training.junit5demo.domain.Employee;

@SpringBootTest
public class EmployeeServiceTests {

    @Mock
    private EmployeeDataAdapter employeeAdapter;

    @InjectMocks // auto inject EmployeeDataAdapter
    private EmployeeService employeeService = new EmployeeService();

    /**
     * @return
     */
    @BeforeEach
    void setMockOutput() {

        String employeeName = "Muthuraj";
        Employee anEmployee = new Employee();
        anEmployee.setName("Muthuraj");

        when(employeeAdapter.getEmployee(employeeName))
                .thenReturn(anEmployee);
        
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGetEmployee() {

        Employee anEmployee = new Employee();
        anEmployee.setName("Muthuraj");

        Employee serviceEmployee = employeeService.getEmployee("Muthuraj");

        assertEquals(anEmployee.getName(), serviceEmployee.getName());

    }

}
