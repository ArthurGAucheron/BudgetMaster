package com.artga.budgetmaster.service.user.domain;

import java.io.Serializable;
import java.time.Instant;

public record User(UserId id,
                   FullName fullName,
                   DigitalChannel digitalChannel,
                   Authentication authentication,
                   EventsListener eventsListener
) implements Serializable {

    public static class Builder {

        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Instant createdAt;

        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Builder withPassword(String password){
            this.password = password;
            return this;
        }

        public Builder withCreatedAt(Instant createdAt){
            this.createdAt = createdAt;
            return this;
        }

        public User build(){
            return new User(
                    null,
                    new FullName.Builder().withFirstName(this.firstName).withLastName(this.lastName).build(),
                    new DigitalChannel.Builder().withEmail(this.email).build(),
                    new Authentication.Builder().withPassword(this.password).build(),
                    new EventsListener.Builder().withCreatedAt(this.createdAt).build()
            );
        }
    }
}


