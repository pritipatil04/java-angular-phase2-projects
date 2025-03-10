package com.sample.controller;

import com.sample.entity.User;
import com.sample.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users"; // Will render users.html
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        userRepository.save(new User(name, email));
        return "redirect:/users";
    }
}
