package com.wipro.service;

import org.springframework.stereotype.Service;

import com.wipro.model.User;
import com.wipro.repo.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

