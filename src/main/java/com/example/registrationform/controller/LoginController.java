package com.example.registrationform.controller;

import com.example.registrationform.model.User;
import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login-form")
    public String loginForm() {
        return "login-form";
    }

    @PostMapping("login-form/login")
    public String login(String username, String password) {

        String userUsername = userService.findByUsername(username);
        String userPassword = userService.findByPassword(password);
        if(userUsername != null && userPassword !=null) {
            return "home";
        }
        else {
            return "redirect:/login-form";
        }
    }

}
