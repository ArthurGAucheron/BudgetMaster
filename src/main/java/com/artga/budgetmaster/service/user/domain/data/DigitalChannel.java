package com.artga.budgetmaster.service.user.domain.data;

import com.artga.budgetmaster.service.user.domain.validation.valide.Email;

import javax.validation.constraints.NotNull;

public record DigitalChannel(String email) {

    public static class Builder{

        @Email
        @NotNull(message = "Email is required")
        private String email;

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public DigitalChannel build(){
            return new DigitalChannel(email);
        }
    }

}
