package com.artga.budgetmaster.service.user.domain.ports.primary;

import com.artga.budgetmaster.service.user.domain.data.User;
import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.domain.ports.secondary.UserPersistencePort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.ValidatorPort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;
import lombok.RequiredArgsConstructor;

import java.time.Clock;

@RequiredArgsConstructor
public class UserDefaultService implements UserServicePort {

    private final Clock clock;
    private final UserPersistencePort persistencePort;
    private final ValidatorPort validatorPort;

    @Override
    public UserId registration(UserRegistrationRequest request) {
        if(isEmailAlreadyExist(request.email()))
            throw new IllegalArgumentException("email already used");

        var user = new User.Builder()
                .withEmail(request.email())
                .withPassword(request.password())
                .withFirstName(request.firstName())
                .withLastName(request.lastName())
                .withCreatedAt(clock.instant())
                .build();

        validatorPort.validate(user);


        //Todo : ajouter une validation de l'objet métier avant de l'envoyer en base de données
        return persistencePort.saveNew(user);
    }

    private boolean isEmailAlreadyExist(String email){
        return persistencePort.getByEmail(email).isPresent();
    }
}
