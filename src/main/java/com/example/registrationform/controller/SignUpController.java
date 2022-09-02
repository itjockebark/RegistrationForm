package com.example.registrationform.controller;

import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SignUpController {

    @Autowired
    UserService userService;
}
