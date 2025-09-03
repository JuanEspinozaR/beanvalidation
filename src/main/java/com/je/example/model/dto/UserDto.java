package com.je.example.model.dto;

import com.je.example.config.validation.OnCreate;
import com.je.example.config.validation.OnUpdate;
import com.je.example.config.validation.custom.anotation.ValidCurp;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    @NotBlank(message = "Name is required", groups = OnCreate.class)
    private String name;

    @Email(message = "Email must be valid", groups = {OnCreate.class, OnUpdate.class})
    @NotBlank(message = "Email is required", groups = OnCreate.class)
    private String email;

    @Min(value = 18, message = "Age must be at least 18", groups = OnCreate.class)
    private int age;

    @ValidCurp(message = "Curp field wrong", groups = OnCreate.class)
    @NotBlank(message = "CURP is required", groups = OnCreate.class)
    private String curp;
}
