package com.artga.budgetmaster.service.user.domain.data;

public record Authentication(String password) {

    public static class Builder{
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
