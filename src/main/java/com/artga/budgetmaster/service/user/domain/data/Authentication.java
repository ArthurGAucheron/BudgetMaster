package com.artga.budgetmaster.service.user.domain.data;

import com.artga.budgetmaster.service.user.domain.validation.valide.Password;

import javax.validation.constraints.NotNull;

public record Authentication(String password) {

    public static class Builder{

        @Password
        @NotNull(message = "Password is required")
        private String password;

        public Builder withPassword(String password){
            this.password = password;
            return this;
        }

        public Authentication build(){
            return new Authentication(this.password);
        }

    }
}
