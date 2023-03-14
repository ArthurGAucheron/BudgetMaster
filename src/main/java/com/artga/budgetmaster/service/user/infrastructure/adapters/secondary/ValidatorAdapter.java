package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary;

import javax.validation.Configuration;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.bootstrap.ProviderSpecificBootstrap;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.ports.secondary.ValidatorPort;
import lombok.AllArgsConstructor;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.HibernateValidatorConfiguration;
import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.Set;

@Service
@AllArgsConstructor
public class ValidatorAdapter implements ValidatorPort {



    @Override
    public void validate(User user) {
        ProviderSpecificBootstrap<HibernateValidatorConfiguration> psb =
                Validation.byProvider(HibernateValidator.class);
        Configuration configuration = (Configuration) psb.configure();
        ValidatorFactory fabrique = configuration.buildValidatorFactory();
        Validator validator = fabrique.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}
