package com.nineleaps.controller;

import com.nineleaps.model.User;
import com.nineleaps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String welcome(){
        return "Hello user!!";
    }

    @PostMapping("/registration")
    public ResponseEntity<User>saveUser(@Valid @RequestBody User user) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.OK);
    }

    @PostMapping("/login")
    public String loginUser(){
        return "Logged IN";
    }
}