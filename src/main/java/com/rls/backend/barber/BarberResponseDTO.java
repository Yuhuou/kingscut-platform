package com.rls.backend.barber;

import java.time.LocalDateTime;

public record BarberResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        String cpf,
        String phone,
        String profilePictureUrl,
        boolean active,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
