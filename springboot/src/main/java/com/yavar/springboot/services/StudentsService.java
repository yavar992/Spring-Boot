package com.yavar.springboot.services;

import com.yavar.springboot.entities.Students;

import java.util.List;

public interface StudentsService {
   // public List<Students> student_detail();

    Students savestudents(Students students);

    List<Students> getallStudent();
}
