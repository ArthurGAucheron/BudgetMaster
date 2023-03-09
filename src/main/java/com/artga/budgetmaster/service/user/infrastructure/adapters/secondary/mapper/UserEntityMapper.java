package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.mapper;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface UserEntityMapper {

    @Mapping(source = "fullName.firstName", target = "firstName")
    @Mapping(source = "fullName.lastName", target = "lastName")
    @Mapping(source = "digitalChannel.email", target = "email")
    @Mapping(source = "authentication.password", target = "password")
    @Mapping(source = "eventsListener.createdAt", target = "createdAt")
    @Mapping(source = "eventsListener.modifiedAt", target = "modifiedAt")
    @Mapping(source = "id.id", target = "id")
    UserEntity toEntity(User domain);

    @Mapping(source = "id", target = "id.id")
    User toDomain(UserEntity entity);

}
