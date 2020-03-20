package com.jellyfishtech.pay.service;

import com.jellyfishtech.pay.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser(String id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(String id);
}

