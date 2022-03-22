package com.halil.secondhandapp.domain.port;

import com.halil.secondhandapp.domain.advertisement.Advertisement;

public interface AdvertisementNotificationPort {
    void sendToQueue(Advertisement advertisement,String mail);
}
