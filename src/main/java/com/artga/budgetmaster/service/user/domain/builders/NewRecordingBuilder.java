package com.artga.budgetmaster.service.user.domain.builders;

import com.artga.budgetmaster.service.user.domain.*;

import java.time.Instant;

public class NewRecordingBuilder {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Instant createdAt;

    public static NewRecordingBuilder newInstance() {
        return new NewRecordingBuilder();
    }

    public NewRecordingBuilder withEmailAndPassword(String email, String password) {
        this.email = email;
        this.password = password;
        return this;
    }

    public NewRecordingBuilder withFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public NewRecordingBuilder wihtCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public User build() {
        return new User(
                null,
                FullNameBuilder.newInstance().withFistName(this.lastName).withLastName(this.firstName).build(),
                DigitalChannelBuilder.newInstance().withEmail(this.email).build(),
                new Authentication(this.password),
                new EventsLitener(this.createdAt, null)
        );
    }

    private static final class FullNameBuilder {

        private String firstName;
        private String lastName;

        private FullNameBuilder(){

        }

        private static FullNameBuilder newInstance(){
                return new FullNameBuilder();
        }

        private FullNameBuilder withFistName(String firstName){
            this.firstName = firstName;
            return this;
        }

        private FullNameBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        private FullName build(){
            return new FullName(this.firstName,this.lastName);
        }
    }

    private static final  class DigitalChannelBuilder{

        private String email;

        private DigitalChannelBuilder(){
        }

        private static DigitalChannelBuilder newInstance(){
            return new DigitalChannelBuilder();
        }

        private DigitalChannelBuilder withEmail(String email){
                this.email = email;
                return this;
        }


        private DigitalChannel build() {
            return DigitalChannel.of(this.email);
        }
    }

}
