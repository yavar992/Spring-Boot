package com.yavar.springboot.repository;

import com.yavar.springboot.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Serializable> {
}
