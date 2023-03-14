package com.artga.budgetmaster.service.user.domain.validation.validator;

import com.artga.budgetmaster.service.user.domain.validation.valide.Password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator  implements ConstraintValidator<Password,String> {

    private static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");

    @Override
    public void initialize(Password constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if(password == null) return true;
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }
}
