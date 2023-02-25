package com.artga.budgetmaster.application.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApplicationUser {

    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private AppUserRole appUserRole;
    private Boolean locked = false;
    private Boolean enabled = false;

}
