package com.artga.budgetmaster.service.user.domain;

import com.artga.budgetmaster.service.user.domain.builders.NewRecordingBuilder;

import java.io.Serializable;

public record User(UserId id,
                   FullName fullName,
                   DigitalChannel digitalChannel,
                   Authentication authentication,
                   EventsLitener eventsLitener
) implements Serializable {

    public static NewRecordingBuilder newRecording() {
        return new NewRecordingBuilder();
    }
}


