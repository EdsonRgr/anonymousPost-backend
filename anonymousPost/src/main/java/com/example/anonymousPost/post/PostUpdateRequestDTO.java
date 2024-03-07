package com.example.anonymousPost.post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record PostUpdateRequestDTO(
        @NotNull
        UUID id,
        @NotBlank
        String texto) {


}
