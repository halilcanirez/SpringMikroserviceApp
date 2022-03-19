package com.halil.secondhandapp.adapter.rest.advertisement;

import com.halil.secondhandapp.domain.advertisement.Advertisement;
import lombok.Builder;
import lombok.Getter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Getter
public class AdvertisementCreateRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String detail;
    @NotNull
    private Double price;
    public Advertisement convertToAdvertisement(){
        return Advertisement.builder()
                .name(name)
                .detail(detail)
                .price(price)
                .build();
    }
}
