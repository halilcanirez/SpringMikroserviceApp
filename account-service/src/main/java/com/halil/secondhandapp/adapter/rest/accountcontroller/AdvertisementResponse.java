package com.halil.secondhandapp.adapter.rest.accountcontroller;

import com.halil.secondhandapp.adapter.jpa.AdvertisementStatus;
import com.halil.secondhandapp.domain.account.AdvertisementOwnedByAccount;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class AdvertisementResponse {

    @NotNull
    private Long id;
    @NotBlank
    private String advertisementName;
    @NotNull
    private Double advertisementPrice;

    @NotNull
    private AdvertisementStatus status;

   /* public static AdvertisementResponse convertToAdvertisementResponse(AdvertisementOwnedByAccount ownedByAccount){
        return builder()
                .id(ownedByAccount.getId())
                .advertisementName(ownedByAccount.getAdvertisementName())
                .advertisementPrice(ownedByAccount.getAdvertisementPrice())
                .status(ownedByAccount.getStatus())
                .build();
    }*/
}
