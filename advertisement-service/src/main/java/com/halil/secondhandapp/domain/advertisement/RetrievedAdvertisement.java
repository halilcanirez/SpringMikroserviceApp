package com.halil.secondhandapp.domain.advertisement;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Getter
public class RetrievedAdvertisement {
    private Long id;
    private String name;
    private String detail;
    private LocalDate createdDate;
    private LocalDateTime updatedDate;
    private AdvertisementStatus advertisementStatus;
    private Double price;
}
