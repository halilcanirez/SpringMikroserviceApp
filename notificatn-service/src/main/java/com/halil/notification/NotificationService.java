package com.halil.notification;

import com.halil.messaging.AdvertisementNotification;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class NotificationService {
    @StreamListener
    public void onNotification(AdvertisementNotification advertisementNotification){
        System.out.println("notification alındı");
    }
}
