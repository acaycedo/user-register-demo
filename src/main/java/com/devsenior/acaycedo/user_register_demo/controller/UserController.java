package com.devsenior.acaycedo.user_register_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.acaycedo.user_register_demo.model.dto.UserRegisterRequest;
import com.devsenior.acaycedo.user_register_demo.service.UserRegisterService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRegisterService userRegisterService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/users/register")
    public void register (@Valid @RequestBody UserRegisterRequest userData) {
        //todo lo que envien por el Json se almacenara en la variable userData que viene de la clase UserRegisterRequest.
        userRegisterService.register(userData);
    }
}
