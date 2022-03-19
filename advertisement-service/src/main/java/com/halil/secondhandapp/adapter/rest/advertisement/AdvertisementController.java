package com.halil.secondhandapp.adapter.rest.advertisement;

import com.halil.secondhandapp.adapter.jpa.advertisement.AdvertisementStatus;
import com.halil.secondhandapp.domain.advertisement.AdvertisementService;
import com.halil.secondhandapp.domain.advertisement.RetrievedAdvertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @PostMapping("/create")
    public AdvertisementResponse createAdvertisement(@RequestBody @Valid AdvertisementCreateRequest request){
        RetrievedAdvertisement advertisement = advertisementService.createAdvertisement(request.convertToAdvertisement());
        return AdvertisementResponse.convertToResponseModel(advertisement);
    }

    @GetMapping("advertisement/{id}")
    public AdvertisementResponse retrieveAdvertisementById(@PathVariable Long id){
        RetrievedAdvertisement advertisement = advertisementService.retrieveAdvertisementById(id);
        return AdvertisementResponse.convertToResponseModel(advertisement);
    }

    @PutMapping("/advertisement/{id}")
    public AdvertisementResponse updateAdvertisementStatus(@PathVariable Long id , @RequestParam AdvertisementStatus newStatus){
        RetrievedAdvertisement advertisement = advertisementService.updateAdvertisementStatus(newStatus,id);
        return AdvertisementResponse.convertToResponseModel(advertisement);
    }

    /*@GetMapping("/advertisement")
    public Page<AdvertisementResponse> getAll(Pageable pageable){

    }*/
}
