package com.yavar.springboot.services;

import com.yavar.springboot.entities.Department;

import java.util.List;

public interface DepartmentService {
    Department savedepartment(Department department);

    List<Department> getdepartment();
}
