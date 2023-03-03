package com.artga.budgetmaster.service.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Value(staticConstructor = "of")
public record DigitalChannel(String email) {

    private final static Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static DigitalChannel of(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if(matcher.find()) return of(email);
        throw new IllegalArgumentException("Email introduced in not valid");
    }


}
