package com.halil.secondhandapp.domain.advertisement;

import com.halil.client.AccountServiceClient;
import com.halil.contract.AccountResponse;
import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import com.halil.secondhandapp.domain.port.AdvertisementNotificationPort;
import com.halil.secondhandapp.domain.port.AdvertisementPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final AdvertisementPersistencePort advertisementPersistencePort;
    private final AccountServiceClient accountServiceClient;
    private final AdvertisementNotificationPort notificationPort;
    public RetrievedAdvertisement retrieveAdvertisementById(Long id){
        return advertisementPersistencePort.retrieve(id);
    }
    @Transactional
    public RetrievedAdvertisement createAdvertisement(Advertisement advertisement){
        //TODO account al
        AccountResponse accountResponse = accountServiceClient.retrieveUser(advertisement.getId());
        RetrievedAdvertisement createdAdvertisement = advertisementPersistencePort.create(advertisement);
        notificationPort.sendToQueue(advertisement,accountResponse.getMail());
        return createdAdvertisement;
    }
    public RetrievedAdvertisement updateAdvertisementStatus(AdvertisementStatus advertisementStatus, Long advertisementId){
        return advertisementPersistencePort.updateAdvertisementStatus(advertisementStatus,advertisementId);
    }
}
