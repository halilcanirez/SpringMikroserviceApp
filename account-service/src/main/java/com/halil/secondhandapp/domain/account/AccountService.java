package com.halil.secondhandapp.domain.account;

import com.halil.secondhandapp.domain.port.AccountPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountPersistencePort accountPersistencePort;

    public Account createUser(Account account) {
        return accountPersistencePort.createAccount(account);
    }

    public Account retrieveUser(Long id) {
        return accountPersistencePort.retrieveAccount(id);
    }

    public void deleteUser(Long id) {
        accountPersistencePort.deleteAccount(id);
    }

    /*public List<AdvertisementOwnedByAccount> retrieveAdvertisementOwnedByAccount(Long accountId){
        return accountPersistencePort.retrieveAdvertisementOwnedByAccount(accountId);
    }*/
}
