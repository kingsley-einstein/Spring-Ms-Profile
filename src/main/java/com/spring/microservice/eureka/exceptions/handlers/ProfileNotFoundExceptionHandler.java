package com.spring.microservice.eureka.exceptions.handlers;

import com.spring.microservice.eureka.exceptions.ProfileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProfileNotFoundExceptionHandler {
    @ExceptionHandler(value = ProfileNotFoundException.class)
    public ResponseEntity<Object> exception(ProfileNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
} 