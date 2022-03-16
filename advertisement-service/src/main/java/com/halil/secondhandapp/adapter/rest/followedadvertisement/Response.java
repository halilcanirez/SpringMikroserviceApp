package com.halil.secondhandapp.adapter.rest.followedadvertisement;

import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementRetrieve;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class Response {

    private Long id;

    private LocalDate createdDate;

    private Long advertisementId;

    private String advertisementName;

    private Double price;

    public static Response convertToResponse(FollowedAdvertisementRetrieve retrieved){
        return Response.builder()
                .id(retrieved.getId())
                .createdDate((retrieved.getCreatedDate()))
                .advertisementId(retrieved.getAdvertisementId())
                .advertisementName(retrieved.getAdvertisementName())
                .price(retrieved.getPrice())
                .build();
    }
}
