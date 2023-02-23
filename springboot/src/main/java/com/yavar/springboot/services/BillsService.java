package com.yavar.springboot.services;

import com.yavar.springboot.entities.Bills;

import java.util.List;

public interface BillsService {

    List<Bills> getbills();

    Bills postbills(Bills bills);

    Bills isUserRegistered(String email);
}
