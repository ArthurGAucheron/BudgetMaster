package com.artga.budgetmaster.service.user.infrastructure.configuration;

import com.artga.budgetmaster.service.user.domain.ports.primary.UserDefaultService;
import com.artga.budgetmaster.service.user.domain.ports.primary.UserServicePort;
import com.artga.budgetmaster.service.user.domain.ports.secondary.UserPersistencePort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.UserJpaAdapter;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.mapper.UserEntityMapper;
import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
@AllArgsConstructor
public class UserConfiguration {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Bean
    public Clock clock(){
        return Clock.systemDefaultZone();
    }

    @Bean
    public UserPersistencePort userPersistence(){
        return  new UserJpaAdapter(userRepository,userEntityMapper);
    }

    @Bean
    public UserServicePort userService(){
        return new UserDefaultService(clock(),userPersistence());
    }

}
