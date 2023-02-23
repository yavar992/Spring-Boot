package com.yavar.springboot.controller;

import com.yavar.springboot.entities.Bills;
import com.yavar.springboot.services.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/vi")
public class BillsController {

    @Autowired
    BillsService billsService;

    @GetMapping("/getbills")
   public List<Bills> getbills(){
        return billsService.getbills();

    }

    @PostMapping("/postbills") 
    public Bills postbills(@RequestBody Bills bills ){
        return billsService.postbills(bills);
    }

    @GetMapping("getbills/{email}")
    public Bills isUserRegistered(@PathVariable("emil") String email){
        System.out.println("user already registered");
        return billsService.isUserRegistered(email);

    }






}
