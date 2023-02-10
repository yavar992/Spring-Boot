package com.yavar.springboot.services;

import com.yavar.springboot.entities.Department;
import com.yavar.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
   private DepartmentRepository departmentRepository;
    @Override
    public Department savedepartment(Department department) {
        System.out.println("we are in the service impl class " +department);
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getdepartment() {
        List<Department> getdept =  departmentRepository.findAll();
        return getdept;
    }

}
