package com.yavar.springboot.services;

import com.yavar.springboot.entities.Department;

import java.util.List;

public interface DepartmentService {
    Department savedepartment(Department department);

    List<Department> getdepartment();

    List<Department> fetchdepartment();

    Department fetchdepartmentId(long departmentId);

    void deletedepartmentbyid(long departmentId);

    Department updatedepartment(long departmentId, Department department);

    Department fetchdatabyname(String departmentName);
}
