package com.example.anonymousPost.post;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record PostRequestDTO(
        @NotBlank
        String texto,
        String urlImg) {

}
