package com.halil.secondhandapp.domain.exception;


import lombok.Getter;

@Getter
public class SecondhandDataNotFoundException extends RuntimeException {

    private final ExceptionType exceptionType;

    public SecondhandDataNotFoundException( ExceptionType exceptionType) {
        super(exceptionType.getMessage());
        this.exceptionType = exceptionType;
    }
}
