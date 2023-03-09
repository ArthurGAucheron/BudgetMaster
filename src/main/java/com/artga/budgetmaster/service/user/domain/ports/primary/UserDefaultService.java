package com.artga.budgetmaster.service.user.domain.ports.primary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.domain.ports.secondary.UserPersistencePort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;
import lombok.RequiredArgsConstructor;

import java.time.Clock;

@RequiredArgsConstructor
public class UserDefaultService implements UserServicePort {

    private final Clock clock;
    private final UserPersistencePort writerUser;

    @Override
    public UserId registration(UserRegistrationRequest request) {
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
