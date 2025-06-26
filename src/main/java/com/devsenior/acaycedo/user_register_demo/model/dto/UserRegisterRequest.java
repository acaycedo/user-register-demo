package com.devsenior.acaycedo.user_register_demo.model.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegisterRequest {
    @NotBlank(message = "Es un campo requerido")
    private String firtName;

    @NotBlank(message = "Es un campo requerido")
    private String lastName;

    @NotBlank
    @Email(message = "Correo no es valido")
    private String email;

    @NotBlank(message = "Nombre de usuario es requerido")
    private String userName;

    @NotBlank(message = "Contraseña es requerida")
    private String password;

    private String phoneNumber;
    private String city;
    private LocalDateTime hireDate;
}
