package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.User;
import com.artga.budgetmaster.service.user.domain.UserId;

import java.util.Optional;

public interface ReadUserPort {

    boolean existsUserByEmail(User user);

    Optional<User> fetchById(UserId userId);

}
