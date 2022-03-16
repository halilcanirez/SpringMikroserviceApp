package com.halil.secondhandapp.domain.port;

import com.halil.secondhandapp.domain.communication.CommunicationInfo;

import java.util.List;

public interface CommunicationPersistencePort {

    Long createCommunicationInfo(CommunicationInfo info);
    List<CommunicationInfo> retrieveCommunicationInfos(Long accountId);
    Long delete(Long id);
    CommunicationInfo updateCommunicationInfos(Long id);
}
