package com.halil.secondhandapp.domain.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionType {

    GENERIC_EXCEPTION(1, "Something wrong"),

    ACCOUNT_DATA_NOT_FOUND(1001, "acount not found"),
    COMMUNICATION_INFO_DATA_NOT_FOUND(1002, "communication information not found"),
    ADVERTISEMENT_DATA_NOT_FOUND(1003, "ADVERTISEMENT NOT FOUND");

    private final Integer code;
    private final String message;
}
