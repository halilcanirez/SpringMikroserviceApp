package com.halil.secondhandapp.adapter.rest.followedadvertisement;

import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementCreate;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementRetrieve;
import com.halil.secondhandapp.domain.followedadvertisement.FollowedAdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class FollowedAdvertisementController {

    private final FollowedAdvertisementService followedAdvertisementService;

    @PostMapping("/followed-advertisement")
    public void createFollowedAdvertisement(@RequestBody CreateRequest create){
        followedAdvertisementService.createFollowedAdvertisement(CreateRequest.convertToServiceModel(create));
    }

    @GetMapping("/followed-advertisement/{accountId}")
    List<Response> retrieveFollowedAdvertisementsByAccountId(@PathVariable Long accountId){
        return followedAdvertisementService.retrieveFollowedAdvertisementsByAccountId(accountId).stream()
                .map(Response::convertToResponse)
                .collect(Collectors.toList());
    }
    @DeleteMapping("/followed-advertisement/{id}")
    void delete(@PathVariable Long id){
        followedAdvertisementService.delete(id);
    }

}
