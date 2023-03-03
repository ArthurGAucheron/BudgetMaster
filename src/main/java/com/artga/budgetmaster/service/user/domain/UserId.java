package com.artga.budgetmaster.service.user.domain;

import lombok.Value;
import java.util.UUID;

@Value(staticConstructor = "of")
public record UserId(
        UUID id
) {
}
