package com.halil.secondhandapp.adapter.jpa.advertisement;


import com.halil.secondhandapp.domain.advertisement.Advertisement;
import com.halil.secondhandapp.domain.advertisement.RetrievedAdvertisement;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "advertisement")
@Entity(name = "advertisement")
public class AdvertisementEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String detail;

    @Column(nullable = false)
    private LocalDate createdDate;

    @Column(nullable = false)
    private LocalDateTime updatedDate;

    @Column(nullable = false)
    private Double price;

    @Enumerated(EnumType.STRING)
    private AdvertisementStatus advertisementStatus;

    public RetrievedAdvertisement convertToRetrievedAdvertisement(){
        return RetrievedAdvertisement.builder()
                .id(id)
                .name(name)
                .detail(detail)
                .createdDate(createdDate)
                .updatedDate(updatedDate)
                .advertisementStatus(advertisementStatus)
                .price(price)
                .build();

    }

    public static AdvertisementEntity convertToEntity(Advertisement advertisement){
        AdvertisementEntity entity = new AdvertisementEntity();
        entity.setName(advertisement.getName());
        entity.setDetail(advertisement.getDetail());
        entity.setCreatedDate(LocalDate.now());
        entity.setUpdatedDate(LocalDateTime.now());
        entity.setAdvertisementStatus(AdvertisementStatus.ACTIVE);
        entity.setPrice(advertisement.getPrice());
        return entity;
    }

}
