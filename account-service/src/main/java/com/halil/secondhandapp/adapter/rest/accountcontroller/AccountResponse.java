package com.halil.secondhandapp.adapter.rest.accountcontroller;

import com.halil.secondhandapp.domain.account.Account;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Builder
@Getter
public class AccountResponse {
    @NotNull
    private Long id;

    @NotBlank
    private String mail;

    @NotBlank
    private String firstNAme;
    @NotBlank
    private String lastName;
    @NotNull
    private LocalDate birthDate;

    public static AccountResponse convertToResponse(Account account){
        return builder()
                .id(account.getId())
                .firstNAme(account.getFirstNAme())
                .lastName(account.getLastName())
                .birthDate(account.getBirthDate())
                .mail(account.getMail())
                .build();
    }
}
