package com.artga.budgetmaster.service.user.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public record FullName(
        String firstName,
        String lastName
) {
}
