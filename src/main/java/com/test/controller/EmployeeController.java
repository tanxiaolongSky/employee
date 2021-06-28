package com.test.controller;

import com.test.entity.Employee;
import com.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @RequestMapping("/employee")
    public Employee getAllEmployee() {
        return employeeService.getAllEmployee();
    }
}
