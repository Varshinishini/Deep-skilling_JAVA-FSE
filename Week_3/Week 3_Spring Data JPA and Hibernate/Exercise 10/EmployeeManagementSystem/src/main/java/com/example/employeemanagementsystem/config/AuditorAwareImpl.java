package com.example.employeemanagementsystem.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // In a real application, this would return the currently logged-in user's username.
        return Optional.of("system"); // For example purposes, hardcoding "system" as the current user.
    }
}
