package com.yavar.springboot.services;

import com.yavar.springboot.entities.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    List<Students> student;


     StudentServiceImpl() {
        student = new ArrayList<>();
        student.add(new Students(23,"yavar","j.j colony , new delhi"));
        student.add(new Students(24,"anas","meerut , uttar pradesh"));
    }

    @Override
    public List<Students> student_detail() {
        return student;
    }
}
