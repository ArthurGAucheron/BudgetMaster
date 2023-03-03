package com.artga.budgetmaster.service.user.domain.ports.primary;


import com.artga.budgetmaster.service.user.domain.builders.NewRecordingBuilder;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserCreationRequest;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;

@Service
@RequiredArgsConstructor
public class UserWriter {

    private final Clock clock;
    private final UserRepository repository;

    @Transactional
    public String create(UserCreationRequest request){
        var user = NewRecordingBuilder.newInstance()
                .withEmailAndPassword(request.email(),request.password())
                .withFullName(request.firstName(),request.lastName())
                .wihtCreatedAt(clock.instant())
                .build();

        repository.saveNew(user);
        return "";
    }


}
