package com.halil.secondhandapp.domain.port;

import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementCreate;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementRetrieve;

import java.util.List;

public interface FollowedAdvertisementPersistencePort {

    FollowedAdvertisementRetrieve createFollowedAdvertisement(FollowedAdvertisementCreate create);
    List<FollowedAdvertisementRetrieve> retrieveFollowedAdvertisementsByAccountId(Long accountId);
    void delete(Long id);

}
