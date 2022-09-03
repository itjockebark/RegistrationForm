package com.example.registrationform.service;

import com.example.registrationform.dao.UserDAO;
import com.example.registrationform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> findAll() {
        return userDAO.findAll();
    }
    
    public User findById(Integer id) {
        Optional<User> user = userDAO.findById(2);
        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

    public String findByUsername(String username) {
        Optional<User> user = userDAO.findByUsername(username);
        if (user.isPresent()) {
            return user.get().getUsername();
        } else {
            return null;
        }
    }

    public String findByPassword(String password) {
        Optional<User> user = userDAO.findByPassword(password);
        if (user.isPresent()) {
            return user.get().getPassword();
        } else {
            return null;
        }
    }

    public void createUser(User user) {
        userDAO.save(user);
    }


}


