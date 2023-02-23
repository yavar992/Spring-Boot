package com.yavar.springboot.services;

import com.yavar.springboot.entities.Department;
import com.yavar.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public List<Department> fetchdepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchdepartmentId(long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deletedepartmentbyid(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updatedepartment(long departmentId, Department department) {
      Department depdb = departmentRepository.findById(departmentId).get();

      if (Objects.nonNull(department.departmentName()) && !"".equalsIgnoreCase(department.departmentName()))
      {
          depdb.setDepartmentName(department.departmentName());
        }
        if (Objects.nonNull(department.departmentAddress()) && !"".equalsIgnoreCase(department.departmentAddress()))
        {
            depdb.setDepartmentAddress(department.departmentAddress());
        }

        if (Objects.nonNull(department.departmentCode()) && !"".equalsIgnoreCase(department.departmentCode()))
        {
            depdb.setDepartmentName(department.departmentCode());
        }
        return departmentRepository.save(department);
    }

    @Override
    public Department fetchdatabyname(String departmentName) {
        return departmentRepository.findById(departmentName).get();
    }

}
