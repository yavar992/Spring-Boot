package com.yavar.springboot.controller;

import com.yavar.springboot.entities.Students;
import com.yavar.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Students> student_detail(){

        return this.studentService.student_detail();
    }

}
