package com.je.example.config.validation.custom.constraint;

import com.je.example.config.validation.custom.anotation.ValidCurp;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CurpValidator implements ConstraintValidator<ValidCurp, String> {

    // Basic CURP regex pattern (18 characters with specific format)
    private static final String CURP_REGEX =
            "^[A-Z]{4}\\d{6}[HM][A-Z]{5}[0-9A-Z]\\d$";

    @Override
    public void initialize(ValidCurp constraintAnnotation) {
        // Optional: setup if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true; // let @NotBlank handle null/empty if needed
        }
        return value.matches(CURP_REGEX);
    }
}
