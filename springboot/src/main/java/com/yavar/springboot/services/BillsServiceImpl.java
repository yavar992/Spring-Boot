package com.yavar.springboot.services;

import com.yavar.springboot.entities.Bills;
import com.yavar.springboot.repository.BillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService{

    @Autowired
    private BillsRepo billsRepo;

    @Override
    public List<Bills> getbills() {
        return billsRepo.findAll();
    }

    @Override
    public Bills postbills(Bills bills) {
        return billsRepo.save(bills);
    }

    @Override
    public Bills isUserRegistered(String email) {
        return billsRepo.existsByemail(email);
    }
}
