package com.halil.secondhandapp.domain.communication;

import com.halil.secondhandapp.adapter.jpa.communication.CommunicationType;
import com.halil.secondhandapp.domain.account.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunicationInfo {

    private Long id;

    private CommunicationType communicationType;

    private String value;

    private Account account;

}
