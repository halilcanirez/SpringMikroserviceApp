package com.halil.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementNotification {
    private String advertisementId;
    private String accountId;
    private String description;
}
