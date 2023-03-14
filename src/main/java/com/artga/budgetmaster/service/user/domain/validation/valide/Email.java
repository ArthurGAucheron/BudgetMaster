package com.artga.budgetmaster.service.user.domain.validation.valide;

import com.artga.budgetmaster.service.user.domain.validation.validator.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmailValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValid {

    String message() default "Email introduced is not valid";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
