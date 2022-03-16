package com.halil.secondhandapp.domain.account;

import com.halil.secondhandapp.adapter.jpa.AdvertisementStatus;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AdvertisementOwnedByAccount {

    @NotNull
    private Long id;
    @NotBlank
    private String advertisementName;
    @NotNull
    private Double advertisementPrice;
    @NotNull
    private AdvertisementStatus status;

}
