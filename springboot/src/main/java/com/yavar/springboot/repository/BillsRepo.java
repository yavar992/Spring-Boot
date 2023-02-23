package com.yavar.springboot.repository;

import com.yavar.springboot.entities.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillsRepo extends JpaRepository<Bills , Long> {
    Bills existsByemail(String email);
    boolean existsByEmail(String email);

}
