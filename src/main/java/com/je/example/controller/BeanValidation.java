package com.je.example.controller;

import com.je.example.model.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1/user")
public class BeanValidation {
    @PostMapping("/save")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDto userDTO) {
        // If validation passes, proceed with logic
        return ResponseEntity.ok("User is valid: " + userDTO.getName());
    }
}
