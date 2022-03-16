package com.halil.secondhandapp.adapter.rest.followedadvertisement;

import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementCreate;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateRequest {

    @NotNull
    private Long advertisementId;

    @NotNull
    private Long accountId;

    public static FollowedAdvertisementCreate convertToServiceModel(CreateRequest request){
        FollowedAdvertisementCreate followedAdvertisementCreate = new FollowedAdvertisementCreate();
        followedAdvertisementCreate.setAdvertisementId(request.getAdvertisementId());
        followedAdvertisementCreate.setAccountId(request.getAccountId());
        return followedAdvertisementCreate;
    }

}
