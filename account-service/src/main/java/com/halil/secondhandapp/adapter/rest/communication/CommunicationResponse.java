package com.halil.secondhandapp.adapter.rest.communication;

import com.halil.secondhandapp.adapter.jpa.communication.CommunicationType;
import com.halil.secondhandapp.domain.communication.CommunicationInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class CommunicationResponse {
    private Long id;
    private CommunicationType communicationType;
    private String value;

    private static CommunicationResponse convertToResponseModel(CommunicationInfo communicationInfo){
        CommunicationResponse communicationResponse = new CommunicationResponse();
        communicationResponse.setId(communicationInfo.getId());
        communicationResponse.setCommunicationType(communicationInfo.getCommunicationType());
        communicationResponse.setValue(communicationInfo.getValue());
        return communicationResponse;

    }

    public static List<CommunicationResponse> convertToResponseList(List<CommunicationInfo> communicationInfoList){
        return communicationInfoList.stream()
                .map(CommunicationResponse::convertToResponseModel)
                .collect(Collectors.toList());
    }
}
