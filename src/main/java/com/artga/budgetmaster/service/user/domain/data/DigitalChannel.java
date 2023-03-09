package com.artga.budgetmaster.service.user.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;

public record DigitalChannel(String email) {

    public static class Builder{

        private String email;
        private static final Pattern VALID_EMAIL_ADDRESS_REGEX = compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public DigitalChannel build(){
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            if(matcher.find()) return new DigitalChannel(email);
            throw new IllegalArgumentException("Email introduced in not valid");
        }
    }

}
