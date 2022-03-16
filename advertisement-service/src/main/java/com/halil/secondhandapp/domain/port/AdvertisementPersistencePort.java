package com.halil.secondhandapp.domain.port;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import com.halil.secondhandapp.domain.advertisement.Advertisement;
import com.halil.secondhandapp.domain.advertisement.RetrievedAdvertisement;

public interface AdvertisementPersistencePort {

    RetrievedAdvertisement retrieve(Long id);
    RetrievedAdvertisement create(Advertisement advertisement);
    RetrievedAdvertisement updateAdvertisementStatus(AdvertisementStatus advertisementStatus, Long advertisementId);
}
