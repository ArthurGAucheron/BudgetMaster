package com.artga.budgetmaster.service.user.infrastructure.adapters.primary;


import com.artga.budgetmaster.service.user.domain.data.UserId;
import com.artga.budgetmaster.service.user.domain.ports.primary.UserServicePort;
import com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto.UserRegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@AllArgsConstructor
@RestController
@RequestMapping("v1/user")
public class UserController {

    private final UserServicePort userService;

    @PostMapping
    public ResponseEntity<UserId> registration(@RequestBody UserRegistrationRequest request){
            return new ResponseEntity<>(
                    userService.registration(request),
                    CREATED);
    }
}
