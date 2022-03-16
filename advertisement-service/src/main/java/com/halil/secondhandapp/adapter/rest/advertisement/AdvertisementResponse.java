package com.halil.secondhandapp.adapter.rest.advertisement;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import com.halil.secondhandapp.domain.account.Account;
import com.halil.secondhandapp.domain.advertisement.RetrievedAdvertisement;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Builder
@Getter
public class AdvertisementResponse {


        private Long id;

        private String name;

        private Account account;

        private String detail;

        private LocalDate createdDate;

        private LocalDateTime updatedDate;

        private AdvertisementStatus advertisementStatus;

        private Double price;


    public static AdvertisementResponse convertToResponseModel(RetrievedAdvertisement advertisement){
        return AdvertisementResponse.builder()
                .account(advertisement.getAccount())
                .id(advertisement.getId())
                .name(advertisement.getName())
                .detail(advertisement.getDetail())
                .createdDate(LocalDate.now())
                .updatedDate(LocalDateTime.now())
                .advertisementStatus(advertisement.getAdvertisementStatus())
                .price(advertisement.getPrice())
                .build();
    }
}
