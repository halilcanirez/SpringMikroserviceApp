package com.halil.secondhandapp.adapter.jpa.followedadvertisement;


import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementEntity;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementRetrieve;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "followed_advertisement")
public class FollowedAdvertisementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AdvertisementEntity advertisement;
    /*
    @ManyToOne
    private AccountEntity account; */

    @Column(nullable = false)
    private LocalDate createdDate;


   public FollowedAdvertisementRetrieve convertToRetrieveModel(){
       return FollowedAdvertisementRetrieve.builder()
               .id(id)
               .advertisementId(advertisement.getId())
               .advertisementName(advertisement.getName())
               .price(advertisement.getPrice())
               .createdDate(createdDate)
               .build();
   }

}
