package com.artga.budgetmaster.service.user.domain.ports.primary;


import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;

public interface UserServicePort {

    UserId registration(UserRegistrationRequest request);



}
