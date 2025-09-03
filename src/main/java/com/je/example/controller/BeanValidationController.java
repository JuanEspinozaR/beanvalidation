package com.je.example.controller;

import com.je.example.config.validation.OnCreate;
import com.je.example.config.validation.OnUpdate;
import com.je.example.model.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class BeanValidationController {
    @PostMapping("/save")
    public ResponseEntity<String> createUser(@Validated(OnCreate.class) @RequestBody UserDto userDTO) {
        // If validation passes, proceed with logic
        return ResponseEntity.ok("User is valid: " + userDTO.getName());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(
            @PathVariable Long id,
            @Validated(OnUpdate.class) @RequestBody UserDto userDTO) {
        // If validation passes, proceed with logic
        return ResponseEntity.ok("User updated!:)");
    }
}
