package com.halil.secondhandapp.domain.followedadvertisement;

import com.halil.secondhandapp.domain.port.FollowedAdvertisementPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FollowedAdvertisementService {

    private final FollowedAdvertisementPersistencePort followedAdvertisementPersistencePort;

    public FollowedAdvertisementRetrieve createFollowedAdvertisement(FollowedAdvertisementCreate create){
        return followedAdvertisementPersistencePort.createFollowedAdvertisement(create);
    }
    public List<FollowedAdvertisementRetrieve> retrieveFollowedAdvertisementsByAccountId(Long accountId){
        return followedAdvertisementPersistencePort.retrieveFollowedAdvertisementsByAccountId(accountId);
    }
    public void delete(Long id){
        followedAdvertisementPersistencePort.delete(id);
    }

}
