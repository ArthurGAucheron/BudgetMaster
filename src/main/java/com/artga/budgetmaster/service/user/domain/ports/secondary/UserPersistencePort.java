package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;

import java.util.Optional;

public interface WriteUserPersistencePort {

    String saveNew(User user);

    Optional<User> update(User user);

    void deleteById(UserId userId);


}
