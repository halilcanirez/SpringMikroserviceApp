package com.halil.secondhandapp.adapter.rest.common;

import com.halil.secondhandapp.domain.exception.SecondhandDataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class SecondhandExceptionHandler {

    @ExceptionHandler(SecondhandDataNotFoundException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)  // isteği işleyemedim
    public ExceptionResponse handleDataNotFoundException(SecondhandDataNotFoundException exception){
        return new ExceptionResponse(exception.getExceptionType());
    }

    /*
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse handleException(Exception e){
        return new ExceptionResponse(ExceptionType.GENERIC_EXCEPTION);
    } */


}
