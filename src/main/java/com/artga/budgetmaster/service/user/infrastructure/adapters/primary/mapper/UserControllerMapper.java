package com.artga.budgetmaster.service.user.infrastructure.adapters.primary.mapper;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserControllerMapper {

    User toDomain(UserRegistrationRequest request);
}
