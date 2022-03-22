package com.halil.messaging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvertisementNotification {
    private Long advertisementId;
    private Long accountId;
    private String message;
    private String mail;
}
