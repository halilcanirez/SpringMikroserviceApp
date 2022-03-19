package com.halil.secondhandapp.adapter.jpa.followedadvertisement;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementJpaRepository;
import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementEntity;
import com.halil.secondhandapp.domain.exception.ExceptionType;
import com.halil.secondhandapp.domain.exception.SecondhandDataNotFoundException;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementCreate;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementRetrieve;
import com.halil.secondhandapp.domain.port.FollowedAdvertisementPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class FollowedAdvertisementJpaAdapter implements FollowedAdvertisementPersistencePort {

    private final FollowedAdvertisementJpaRepository followedAdvertisementJpaRepository;
    private final AdvertisementJpaRepository advertisementJpaRepository;
    //private final AccountJpaRepository accountJpaRepository;
    @Override
    public FollowedAdvertisementRetrieve createFollowedAdvertisement(FollowedAdvertisementCreate create) {
        /*AccountEntity accountEntity= retrieveAccount(create.getAccountId());
        AdvertisementEntity advertisementEntity=retrieveAdvertisementEntityById(create.getAdvertisementId());
        FollowedAdvertisementEntity entity=createFollowedAdvertisementEntity(accountEntity,advertisementEntity);

        return followedAdvertisementJpaRepository.save(entity).convertToRetrieveModel(); */
        return null;
    }

    @Override
    public List<FollowedAdvertisementRetrieve> retrieveFollowedAdvertisementsByAccountId(Long accountId) {
        /*return followedAdvertisementJpaRepository.findAllByAccount_Id(accountId).stream()
                .map(FollowedAdvertisementEntity::convertToRetrieveModel)
                .collect(Collectors.toList());*/
        return null;
    }

    @Override
    public void delete(Long id) {
        followedAdvertisementJpaRepository.findById(id);
    }

    private AdvertisementEntity retrieveAdvertisementEntityById(Long advertisementId){
        return advertisementJpaRepository.findById(advertisementId)
                .map(a -> {return  Optional.of(a).get();})
                .orElseThrow(() -> new SecondhandDataNotFoundException(ExceptionType.ADVERTISEMENT_DATA_NOT_FOUND));
    }

    /*
    private AccountEntity retrieveAccount(Long id) {
        return accountJpaRepository.findById(id)
                .map(a -> {return Optional.of(a).get();})
                .orElseThrow(()-> new SecondhandDataNotFoundException(ExceptionType.ACCOUNT_DATA_NOT_FOUND));
    }
    private FollowedAdvertisementEntity createFollowedAdvertisementEntity(AccountEntity accountEntity, AdvertisementEntity advertisementEntity ){
        FollowedAdvertisementEntity followedAdvertisementEntity= new FollowedAdvertisementEntity();
        followedAdvertisementEntity.setAccount(accountEntity);
        followedAdvertisementEntity.setAdvertisement(advertisementEntity);
        followedAdvertisementEntity.setCreatedDate(LocalDate.now());
        return followedAdvertisementEntity;
    }*/
}
