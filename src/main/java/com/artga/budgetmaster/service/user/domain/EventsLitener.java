package com.artga.budgetmaster.service.user.domain;

import java.time.Instant;

public record EventsLitener(
        Instant createdAt,
        Instant modifiedAt
) {
}
