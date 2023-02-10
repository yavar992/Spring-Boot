package com.yavar.springboot.controller;

import com.yavar.springboot.entities.Department;
import com.yavar.springboot.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @PostMapping("/departments")
    public ResponseEntity<Department> savedepartment(@RequestBody  Department department){
       Department dep =  departmentService.savedepartment(department);
       return ResponseEntity.status(HttpStatus.OK).body(dep);
    }

    @GetMapping("/department-get")
    public ResponseEntity<List<Department>> getdepartment(){
       List<Department> depget =   departmentService.getdepartment();
       return new ResponseEntity<>(depget,HttpStatus.OK);
    }

//    public Department savedepartment(@RequestBody Department department){
//        System.out.println(department);
//      return   departmentService.savedepartment(department);
//
//    }
}
