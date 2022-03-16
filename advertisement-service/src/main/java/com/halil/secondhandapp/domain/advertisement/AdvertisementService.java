package com.halil.secondhandapp.domain.advertisement;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import com.halil.secondhandapp.domain.port.AdvertisementPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final AdvertisementPersistencePort advertisementPersistencePort;

    public RetrievedAdvertisement retrieveAdvertisementById(Long id){
        return advertisementPersistencePort.retrieve(id);
    }

    public RetrievedAdvertisement createAdvertisement(Advertisement advertisement){
        return advertisementPersistencePort.create(advertisement);
    }

    public RetrievedAdvertisement updateAdvertisementStatus(AdvertisementStatus advertisementStatus, Long advertisementId){
        return advertisementPersistencePort.updateAdvertisementStatus(advertisementStatus,advertisementId);
    }
}
