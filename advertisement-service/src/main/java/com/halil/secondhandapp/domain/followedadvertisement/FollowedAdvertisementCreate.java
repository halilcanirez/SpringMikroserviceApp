package com.halil.secondhandapp.domain.followedadvertisement;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class FollowedAdvertisementCreate {

    @NotNull
    private Long advertisementId;

    @NotNull
    private Long accountId;

}
