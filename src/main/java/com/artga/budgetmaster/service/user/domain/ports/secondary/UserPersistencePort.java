package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;

import java.util.Optional;

public interface UserPersistencePort {

    UserId saveNew(User user);

    Optional<User> getByEmail(String email);

}
