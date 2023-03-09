package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;

import java.util.Optional;
import java.util.UUID;

public interface UserPersistencePort {

    UserId saveNew(User user);

    Optional<User> update(User user);

    void deleteById(UserId userId);

    boolean existsUserByEmail(User user);

    Optional<User> fetchById(UserId userId);


}
