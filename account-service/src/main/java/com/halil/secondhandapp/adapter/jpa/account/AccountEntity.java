package com.halil.secondhandapp.adapter.jpa.account;

import com.halil.secondhandapp.advertisement.AdvertisementEntity;
import com.halil.secondhandapp.adapter.jpa.communication.CommunicationInfoEntity;
import com.halil.secondhandapp.domain.account.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity(name = "accountEntity")
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mail;

    private String firstNAme;

    private String lastName;

    private LocalDate birthDate;

    private String passwd;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "account")
    private Set<CommunicationInfoEntity> communicationInfos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private List<AdvertisementEntity> advertisement;


    public static AccountEntity convert_to_AccountEntity(Account account){
        AccountEntity entity = new AccountEntity();
        entity.setId(account.getId());
        entity.setFirstNAme(account.getFirstNAme());
        entity.setLastName(account.getLastName());
        entity.setMail(account.getMail());
        entity.setBirthDate(account.getBirthDate());
        entity.setMail(account.getMail());
        entity.setPasswd(account.getPasswd());
        return entity;
    }

    public Account convertToAccount(){
        return Account.builder()
                .firstNAme(firstNAme)
                .lastName(lastName)
                .birthDate(birthDate)
                .mail(mail)
                .id(id)
                .passwd(passwd)
                .build();
    }
}
