package com.artga.budgetmaster.service.user.domain.ports.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;

public interface ValidatorPort {

    void validate(User use);
}
