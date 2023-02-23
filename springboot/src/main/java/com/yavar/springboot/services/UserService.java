package com.yavar.springboot.services;

import com.yavar.springboot.entities.User;

import java.util.List;

public interface UserService {
    List<User> getuser();

    User postuser(User user);

    User getuserbyid(long id);

    void deleteuser(long id);

    User updateuser(long id, User user);
}
