package com.artga.budgetmaster.service.user.infrastructure.adapters.primary.dto;

public record UserRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        String password) {
}
