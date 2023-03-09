package com.artga.budgetmaster.service.user.domain;

import static org.apache.commons.lang3.StringUtils.isAllBlank;

public record FullName(String firstName, String lastName) {

    public static class Builder{

        private String firstName;
        private String lastName;

        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public FullName build(){
            if(isAllBlank(this.firstName,this.lastName))
                throw new IllegalArgumentException("firstName and lastName are blank");
            return new FullName(this.firstName,this.lastName);
        }
    }


}
