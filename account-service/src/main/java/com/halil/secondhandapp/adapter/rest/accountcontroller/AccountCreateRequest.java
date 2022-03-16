package com.halil.secondhandapp.adapter.rest.accountcontroller;

import com.halil.secondhandapp.domain.account.Account;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class AccountCreateRequest {


    @NotBlank
    private String mail;

    @NotBlank
    private String firstNAme;
    @NotBlank
    private String lastName;
    @NotNull
    private LocalDate birthDate;
    @NotBlank
    private String passwd;

    public Account convertToUser(){
        return Account.builder()
                .firstNAme(firstNAme)
                .lastName(lastName)
                .birthDate(birthDate)
                .mail(mail)
                .passwd(passwd)
                .build();

    }

}
