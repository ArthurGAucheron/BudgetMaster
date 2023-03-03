package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.User;
import com.artga.budgetmaster.service.user.domain.UserId;

import java.util.Optional;

public interface WriteUserPort {

    User saveNew(User user);

    Optional<User> update(User user);

    void deleteById(UserId userId);


}
