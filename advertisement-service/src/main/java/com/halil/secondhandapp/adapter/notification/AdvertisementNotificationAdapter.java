package com.halil.secondhandapp.adapter.notification;

import com.halil.messaging.AdvertisementNotification;
import com.halil.secondhandapp.domain.advertisement.Advertisement;
import com.halil.secondhandapp.domain.port.AdvertisementNotificationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class AdvertisementNotificationAdapter implements AdvertisementNotificationPort {

    private final Source source;
    @Override
    public void sendToQueue(Advertisement advertisement, String mail) {
        AdvertisementNotification advertisementNotification=new AdvertisementNotification();
        advertisementNotification.setAdvertisementId(advertisement.getId());
        advertisementNotification.setAccountId(advertisement.getAccountId());
        advertisementNotification.setMail(mail);
        advertisementNotification.setMessage("İlan Oluşlturuldu");
        source.output().send(MessageBuilder.withPayload(advertisementNotification).build());
    }
}
