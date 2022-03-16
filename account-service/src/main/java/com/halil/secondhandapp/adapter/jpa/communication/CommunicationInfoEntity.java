package com.halil.secondhandapp.adapter.jpa.communication;

import com.halil.secondhandapp.adapter.jpa.account.AccountEntity;
import com.halil.secondhandapp.domain.communication.CommunicationInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "commicationInfoEntity")
@Table(name = "communication_info")
public class CommunicationInfoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private AccountEntity account;

    @Enumerated(EnumType.STRING)
    private CommunicationType communicationType;

    private String value;


    public static CommunicationInfoEntity convertToEntity(CommunicationInfo communicationInfo){
        CommunicationInfoEntity entity = new CommunicationInfoEntity();
        entity.setAccount(AccountEntity.convert_to_AccountEntity(communicationInfo.getAccount()));
        entity.setValue(communicationInfo.getValue());
        entity.setCommunicationType(communicationInfo.getCommunicationType());
        return entity;
    }

    public CommunicationInfo convertToModel(){
        CommunicationInfo communicationInfo = new CommunicationInfo();
        communicationInfo.setCommunicationType(communicationType);
        communicationInfo.setValue(value);
        communicationInfo.setId(id);
        return communicationInfo;
    }


}
