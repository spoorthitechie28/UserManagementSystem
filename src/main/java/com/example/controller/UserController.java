package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    // =========================
    // ADMIN APIs
    // =========================

    @PostMapping("/admin/user")
    public User saveUser(@RequestBody @Valid UserDto userDto) {

        return service.saveUser(userDto);
    }

    @GetMapping("/admin/users")
    public List<User> getAll() {

        return service.getAllUsers();
    }

    @GetMapping("/admin/user/{id}")
    public User getUser(@PathVariable Long id) {

        return service.getUserById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }

    @PutMapping("/admin/user/{id}")
    public User updateUser(
            @PathVariable Long id,
            @RequestBody User user) {

        user.setId(id);

        return service.updateUser(user);
    }

    @DeleteMapping("/admin/user/{id}")
    public String deleteUser(@PathVariable Long id) {

        return service.deleteUser(id);
    }

    // =========================
    // USER APIs
    // =========================

    @GetMapping("/user/home")
    public String userHome() {

        return "Welcome USER";
    }

    // =========================
    // ADMIN HOME
    // =========================

    @GetMapping("/admin/home")
    public String adminHome() {

        return "Welcome ADMIN";
    }
}