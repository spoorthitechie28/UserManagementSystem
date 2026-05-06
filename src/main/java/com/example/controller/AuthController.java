package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.*;

import com.example.dto.LoginDto;
import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService;

import com.example.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // REGISTER

    @PostMapping("/register")
    public User register(
            @RequestBody UserDto userDto) {

        return service.saveUser(userDto);
    }

    // LOGIN

    @PostMapping("/login")
    public String login(
            @RequestBody LoginDto dto) {

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(

                        dto.getEmail(),

                        dto.getPassword()));

        return jwtUtil.generateToken(dto.getEmail());
    }
}