package com.halil.secondhandapp.adapter.rest.communication;

import com.halil.secondhandapp.adapter.jpa.communication.CommunicationType;
import com.halil.secondhandapp.domain.communication.CommunicationInfoCreate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CommunicationCreateRequest {


    @NotNull
    private CommunicationType communicationType;

    @NotBlank
    private String value;

    @NotNull
    private Long accountId;

    public CommunicationInfoCreate convert(){
        CommunicationInfoCreate communicationInfoCreate = new CommunicationInfoCreate();
        communicationInfoCreate.setCommunicationType(communicationType);
        communicationInfoCreate.setValue(value);
        communicationInfoCreate.setAccountId(accountId);
        return communicationInfoCreate;
    }
}
