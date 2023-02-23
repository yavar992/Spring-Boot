package com.yavar.springboot.controller;

import com.yavar.springboot.entities.Department;
import com.yavar.springboot.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/departments")
    public Department savedepartment(@RequestBody Department department){
        System.out.println(department);
        return  departmentService.savedepartment(department);
    }

//
    @GetMapping("/department-get")
    public List<Department> fetchdepartment(){
       return departmentService.fetchdepartment();
    }

    @GetMapping("/department-get/{id}")
    public Department fetchdepartmentbyId(@PathVariable ("id") long departmentId){
        System.out.println("here is " + departmentId);
        return departmentService.fetchdepartmentId(departmentId);
    }
    @GetMapping(value = "/department-get/",params = "name")
    Department fetchdatabyname(@PathVariable("name") String departmentName){
        System.out.println("here is my data of " + departmentName);
        return departmentService.fetchdatabyname(departmentName);
    }
    @DeleteMapping("/department/{id}")
    public String deletedepartmentbyid(@PathVariable("id") long departmentId){
        departmentService.deletedepartmentbyid(departmentId);
        return "department id " + departmentId + " delete successfully";
    }

    @PutMapping("/department/{id}")
    public Department updatedepartment(@PathVariable("id") long departmentId ,@RequestBody Department department){
       return departmentService.updatedepartment(departmentId , department);
    }

}
