package com.wipro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wipro.service.UserService;
import com.wipro.model.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
