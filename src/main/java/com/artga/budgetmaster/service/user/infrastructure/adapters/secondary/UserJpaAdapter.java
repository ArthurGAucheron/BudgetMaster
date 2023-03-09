package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.domain.ports.secondary.UserPersistencePort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.entity.UserEntity;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.mapper.UserEntityMapper;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserJpaAdapter implements UserPersistencePort {

    private final UserRepository repository;
    private final UserEntityMapper mapper;

    @Override
    public UserId saveNew(User user) {
        UserEntity entity = mapper.toEntity(user);
        entity = repository.save(entity);
        User domain = mapper.toDomain(entity);
        return domain.id();
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UserId userId) {

    }

    @Override
    public boolean existsUserByEmail(User user) {
        return false;
    }

    @Override
    public Optional<User> fetchById(UserId userId) {
        return Optional.empty();
    }
}
