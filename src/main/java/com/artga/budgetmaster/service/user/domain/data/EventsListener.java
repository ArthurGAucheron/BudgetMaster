package com.artga.budgetmaster.service.user.domain.data;

import javax.validation.constraints.NotNull;
import java.time.Instant;

public record EventsListener(Instant createdAt, Instant modifiedAt
) {
    public static class Builder {

        @NotNull
        private  Instant createdAt;
        private  Instant modifiedAt;

        public Builder withCreatedAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withModifiedAt(Instant modifiedAt){
            this.modifiedAt = modifiedAt;
            return this;
        }

        public EventsListener build(){
            return  new EventsListener(
                    this.createdAt,
                    this.modifiedAt
            );
        }
    }
}
