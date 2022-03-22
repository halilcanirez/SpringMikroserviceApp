package com.halil.secondhandapp.domain.communication;

import com.halil.secondhandapp.adapter.jpa.communication.CommunicationType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunicationInfoCreate {
    private CommunicationType communicationType;
    private String value;
    private Long accountId;
}
