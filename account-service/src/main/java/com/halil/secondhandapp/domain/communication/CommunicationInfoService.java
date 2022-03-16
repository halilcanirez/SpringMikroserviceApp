package com.halil.secondhandapp.domain.communication;


import com.halil.secondhandapp.domain.port.AccountPersistencePort;
import com.halil.secondhandapp.domain.port.CommunicationPersistencePort;
import com.halil.secondhandapp.domain.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunicationInfoService {

    private final CommunicationPersistencePort communicationPersistencePort;
    private final AccountPersistencePort accountPersistencePort;

    public Long createCommunicationInfo(CommunicationInfoCreate info){
        Account account = accountPersistencePort.retrieveAccount(info.getAccountId());
        CommunicationInfo communicationInfo = new CommunicationInfo();
        communicationInfo.setAccount(account);
        communicationInfo.setCommunicationType(info.getCommunicationType());
        communicationInfo.setValue(info.getValue());
        return communicationPersistencePort.createCommunicationInfo(communicationInfo);
    }

    public List<CommunicationInfo> retrieveCommunicationInfos(Long id){
        //Account account = accountPersistencePort.retrieveUser(id);
        return communicationPersistencePort.retrieveCommunicationInfos(id);
    }

    /*
    public Long delete(Long id){

    }
    public CommunicationInfo updateCommunicationInfo(Long id){

    } */

}
