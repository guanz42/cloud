package com.user.controller;

import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.user.service.UserService;


@RestController
public class UserController {
    private final UserService userService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    String getUserByID(@PathVariable Integer id) {
        User user = userService.getUserByID(id);
        System.out.println(user);
        return user.toString() + serverPort;
    }
}
