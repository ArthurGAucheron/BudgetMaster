package com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto;

public record UserCreationRequest(
        String firstName,
        String lastName,
        String email,
        String password) {
}
