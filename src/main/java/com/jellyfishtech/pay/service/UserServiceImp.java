package com.jellyfishtech.pay.service;

import com.jellyfishtech.pay.dao.UserDAO;
import com.jellyfishtech.pay.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
@Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser(String id) {
        return userDAO.findAll();
    }

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
            userDAO.save(user);
    }

    @Override
    public void deleteUserById(String id) {
            userDAO.deleteById(id);
    }
}
