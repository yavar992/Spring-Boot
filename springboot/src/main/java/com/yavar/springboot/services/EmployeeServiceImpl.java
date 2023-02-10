package com.yavar.springboot.services;

import com.yavar.springboot.entities.Employee;
import com.yavar.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    EmployeeServiceImpl(){

    }



    @Override
    public Employee getcourses(Employee employee) {
        return employeeRepository.save(employee);
}
}