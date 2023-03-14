package com.artga.budgetmaster.service.user.infrastructure.configuration;

import com.artga.budgetmaster.service.user.domain.ports.primary.UserDefaultService;
import com.artga.budgetmaster.service.user.domain.ports.primary.UserServicePort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.UserPersistencePort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.ValidatorPort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
@AllArgsConstructor
public class UserConfiguration {

    private final UserPersistencePort userPersistencePort;
    private final ValidatorPort validatorPort;

    @Bean
    public Clock clock(){
        return Clock.systemDefaultZone();
    }


    @Bean
    public UserServicePort userService(){
        return new UserDefaultService(clock(),userPersistencePort,validatorPort);
    }

}
