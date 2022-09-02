package com.example.registrationform.controller;

import com.example.registrationform.model.User;
import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("login-form")
    public String loginForm() {
        return "login-form";
    }


}
