package com.yavar.springboot.repository;

import com.yavar.springboot.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface Studentsrepo extends JpaRepository<Students, Serializable> {

}
