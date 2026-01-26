package com.rls.backend.barber;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;

public record BarberRequestDTO(
       @NotBlank String firstName,
       @NotBlank String lastName,
       @Email @NotBlank String email,
       @CPF @NotBlank String cpf,
       @NotBlank @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid phone number format") String phone,
       @NotBlank String profilePicture
) {
}
