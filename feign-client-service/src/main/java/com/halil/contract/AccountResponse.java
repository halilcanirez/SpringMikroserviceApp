package com.halil.contract;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
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

}
