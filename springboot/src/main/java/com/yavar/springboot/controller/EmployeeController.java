package com.yavar.springboot.controller;

import com.yavar.springboot.entities.Employee;
import com.yavar.springboot.services.EmployeeService;
import com.yavar.springboot.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

   @Autowired
   private EmployeeService employeeService;

   @GetMapping("/employee")

   public Employee getEmployee(@RequestBody Employee employee){
     return employeeService.getcourses(employee);
   }


   }

