package com.mballem.demoparkapi.web.controller.dto;


import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UsuarioCreateDto {
    @NotBlank
    @Email(message = "formato de email inválido", regexp = "^[a-zA-Z0-9.+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$")
    private String username;
    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
