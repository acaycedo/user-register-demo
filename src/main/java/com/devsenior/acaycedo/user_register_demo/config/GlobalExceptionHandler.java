package com.devsenior.acaycedo.user_register_demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import exceptions.UserAlreadyExistException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ApiErrorResponse> handleUserAlreadyExist(UserAlreadyExistException ex, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
        .body(new ApiErrorResponse(HttpStatus.CONFLICT, ex.getMessage(), request.getRequestURI()));
        // Build solo para construir el objeto ya que no quiero crear mas o añadir mas
        // acciones
    }

    public ResponseEntity<ApiErrorResponse> handleRuntime(RuntimeException ex,  HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), request.getRequestURI()));
    }

    public ResponseEntity<ApiErrorResponse> handleException(Exception ex,  HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR
        ,"Ha ocurrido un error inesperado en el servidor. Por favor, intente más tarde."
        ,request.getRequestURI()));
    }
}
