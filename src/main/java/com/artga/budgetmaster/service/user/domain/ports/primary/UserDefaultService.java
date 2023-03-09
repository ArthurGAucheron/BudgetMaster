package com.artga.budgetmaster.service.user.domain.service;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.ports.primary.UserServicePort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.WriteUserPersistencePort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;
import lombok.RequiredArgsConstructor;

import java.time.Clock;

@RequiredArgsConstructor
public class UserDefaultService implements UserServicePort {

    private final Clock clock;
    private final WriteUserPersistencePort writerUser;

    @Override
    public String registration(UserRegistrationRequest request) {
        var user = new User.Builder()
                .withEmail(request.email())
                .withPassword(request.password())
                .withFirstName(request.firstName())
                .withLastName(request.lastName())
                .withCreatedAt(clock.instant())
                .build();
        return writerUser.saveNew(user);
    }
}
