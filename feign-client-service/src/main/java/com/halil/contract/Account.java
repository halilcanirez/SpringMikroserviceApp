package com.halil.contract;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Builder
public class Account {

    private Long id;
    private String mail;
    private String firstNAme;
    private String lastName;
    private LocalDate birthDate;
    private String passwd;
}
