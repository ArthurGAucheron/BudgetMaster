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
        return mapper.toDomain(
                repository.save(
                    mapper.toEntity(user)
                )
        ).id();
    }

    @Override
    public Optional<User> getByEmail(String email) {
        return repository.findByEmailIgnoreCase(email).map(mapper::toDomain);
    }
}
