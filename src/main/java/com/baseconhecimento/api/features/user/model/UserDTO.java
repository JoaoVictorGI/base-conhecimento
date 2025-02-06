package com.baseconhecimento.api.features.user.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(@NotBlank(message = "E-mail is needed") String email, @NotBlank(message = "Password is needed") @Size(min = 4, message = "Minimum of 4 characters") String password) {
}
