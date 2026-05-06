package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // SAVE USER

    public User saveUser(UserDto userDto) {

        User user = new User();

        user.setName(userDto.getName());

        user.setEmail(userDto.getEmail());

        // ENCODE PASSWORD
        user.setPassword(
                passwordEncoder.encode(userDto.getPassword()));

        user.setRole(userDto.getRole());

        return repository.save(user);
    }

    // GET ALL USERS

    public List<User> getAllUsers() {

        return repository.findAll();
    }

    // GET USER BY ID

    public Optional<User> getUserById(Long id) {

        return repository.findById(id);
    }

    // UPDATE USER

    public User updateUser(User user) {

        return repository.save(user);
    }

    // DELETE USER

    public String deleteUser(Long id) {

        repository.deleteById(id);

        return "User deleted successfully";
    }
}