package com.yavar.springboot.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.yavar.springboot.entities.User;
import com.yavar.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")


public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    List<User> getuser(){
        return  userService.getuser();
    }

    @PostMapping(value = "/postuser", produces = MediaType.APPLICATION_JSON_VALUE)
    User postuser(@RequestBody User user){
        return userService.postuser(user);
    }


//    @PostMapping(value = "/save-user-response", produces = MediaType.APPLICATION_JSON_VALUE)
//    ResponseEntity<String> saveuser(RequestEntity<RegisterDTO>  request) {
//        JsonObject failedresponse = new JsonObject();
//        if (request.getBody() == null) {
//            failedresponse.addProperty("status", "failed");
//            failedresponse.addProperty("message", "all field empty");
//            return ResponseEntity.ok().body(failedresponse.toString());
//        }
//
//        return null;
//    }



    @GetMapping("getuser/{id}")
    User getuserbyid(@PathVariable("id") long id){
        return  userService.getuserbyid(id);
    }

    @DeleteMapping("user/{id}")
    String deleteuser(@PathVariable("id") long id){
        userService.deleteuser(id);
        return id + " deleted successfully";
    }

    @PutMapping("/user/{id}")
    User updateuser(@PathVariable("id") long id , @RequestBody User user){
       return userService.updateuser(id ,user);
    }
}
