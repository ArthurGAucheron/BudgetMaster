package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.domain.ports.secondary.WriteUserPersistencePort;

import java.util.Optional;

public class UserWriterJpaAdapter implements WriteUserPersistencePort {

    @Override
    public String saveNew(User user) {
        return null;
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UserId userId) {

    }
}
