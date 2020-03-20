package com.jellyfishtech.pay.controller;

import com.jellyfishtech.pay.entity.User;
import com.jellyfishtech.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //get all details of user
    @GetMapping("/user/{id}")
     public List<User> getAllUser(@PathVariable ("id") String id){
        return userService.getAllUser(id);
            }

    //create user
    @PostMapping("/user")
    public void saveAllUser(@RequestBody User user){
       userService.saveUser(user);
    }
    //update user
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }
        //delete user
    @DeleteMapping("/deleteUser{id}")
    public void deleteUser(@PathVariable("id") String id){
        userService.deleteUserById(id);
    }
}
