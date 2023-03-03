package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary;

import com.artga.budgetmaster.service.user.domain.User;
import com.artga.budgetmaster.service.user.domain.UserId;
import com.artga.budgetmaster.service.user.domain.ports.secondary.ReadUserPort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.WriteUserPort;

import java.util.Optional;

public class UserRepository implements WriteUserPort, ReadUserPort {


    @Override
    public boolean existsUserByEmail(User user) {
        return false;
    }

    @Override
    public Optional<User> fetchById(UserId userId) {
        return Optional.empty();
    }

    @Override
    public User saveNew(User user) {
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
