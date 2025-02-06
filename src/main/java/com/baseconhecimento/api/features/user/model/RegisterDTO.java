package com.baseconhecimento.api.features.user.model;

public record RegisterDTO(String email, String password, UserRole role) {
}
