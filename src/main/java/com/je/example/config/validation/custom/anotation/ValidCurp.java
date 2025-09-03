package com.je.example.config.validation.custom.anotation;
import com.je.example.config.validation.custom.constraint.CurpValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CurpValidator.class) // Link to the validator class
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCurp {

    String message() default "Invalid CURP format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
