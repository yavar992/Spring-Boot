package com.yavar.springboot.services;

import com.yavar.springboot.entities.User;
import com.yavar.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getuser() {
        return userRepository.findAll();
    }

    @Override
    public User postuser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getuserbyid(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteuser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateuser(long id, User user) {
         User userdb = userRepository.findById(id).get();
         if (Objects.nonNull(user.name())&& !"".equalsIgnoreCase(user.name())){
             userdb.setName(user.name());
         }

        if (Objects.nonNull(user.username())&& !"".equalsIgnoreCase(user.email())){
            userdb.setEmail(user.email());
        }
        if (Objects.nonNull(user.username())&& !"".equalsIgnoreCase(user.username())){
            userdb.setUsername(user.username());
        }
        if (Objects.nonNull(user.email())&& !"".equalsIgnoreCase(user.email())){
            userdb.setEmail(user.email());
        }

        if (Objects.nonNull(user.phone())&& !"".equalsIgnoreCase(String.valueOf(user.phone()))) {
            userdb.setPhone(user.phone());
        }

        if (Objects.nonNull(user.password())&& !"".equalsIgnoreCase((user.password()))) {
            userdb.setPassword(user.password());
        }



        return userRepository.save(user);
    }
}
