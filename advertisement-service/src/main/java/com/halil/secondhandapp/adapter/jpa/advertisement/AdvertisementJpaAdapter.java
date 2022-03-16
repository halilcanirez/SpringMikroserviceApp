package com.halil.secondhandapp.adapter.jpa.advertisement;

import com.halil.secondhandapp.account.AccountEntity;
import com.halil.secondhandapp.account.AccountJpaRepository;
import com.halil.secondhandapp.domain.advertisement.Advertisement;
import com.halil.secondhandapp.domain.advertisement.RetrievedAdvertisement;
import com.halil.secondhandapp.domain.exception.ExceptionType;
import com.halil.secondhandapp.domain.exception.SecondhandDataNotFoundException;
import com.halil.secondhandapp.domain.port.AdvertisementPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AdvertisementJpaAdapter implements AdvertisementPersistencePort {

    private final AdvertisementJpaRepository advertisementJpaRepository;
    private final AccountJpaRepository accountJpaRepository;

    @Override
    public RetrievedAdvertisement retrieve(Long id) {
        return retrieveAdvertisementEntityById(id).convertToRetrievedAdvertisement();
    }

    @Override
    public RetrievedAdvertisement create(Advertisement advertisement) {
        AccountEntity accountEntity = accountJpaRepository.findById(advertisement.getAccountId())
                .map(a -> {return Optional.of(a).get();}
                ).orElseThrow(() ->new SecondhandDataNotFoundException(ExceptionType.ACCOUNT_DATA_NOT_FOUND));

        return advertisementJpaRepository.save(AdvertisementEntity.convertToEntity(advertisement,accountEntity))
                .convertToRetrievedAdvertisement();
    }

    @Override
    public RetrievedAdvertisement updateAdvertisementStatus(AdvertisementStatus advertisementStatus, Long advertisementId) {

        AdvertisementEntity entity = retrieveAdvertisementEntityById(advertisementId);
        entity.setAdvertisementStatus(advertisementStatus);
        return advertisementJpaRepository.save(entity).convertToRetrievedAdvertisement();

    }

    private AdvertisementEntity retrieveAdvertisementEntityById(Long advertisementId){
        return advertisementJpaRepository.findById(advertisementId)
                .map(a -> {return  Optional.of(a).get();})
                .orElseThrow(() -> new SecondhandDataNotFoundException(ExceptionType.ADVERTISEMENT_DATA_NOT_FOUND));
    }


}
