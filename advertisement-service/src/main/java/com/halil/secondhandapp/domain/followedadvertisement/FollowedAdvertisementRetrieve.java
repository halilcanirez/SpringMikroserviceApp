package com.halil.secondhandapp.domain.followedadvertisement;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class FollowedAdvertisementRetrieve {

    private Long id;

    private LocalDate createdDate;

    private Long advertisementId;

    private String advertisementName;

    private Double price;


}
