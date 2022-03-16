package com.halil.secondhandapp.domain.port;

import com.halil.secondhandapp.domain.account.Account;
import com.halil.secondhandapp.domain.account.AdvertisementOwnedByAccount;

import java.util.List;

public interface AccountPersistencePort {

    Account createAccount(Account account);
    Account retrieveAccount(Long id);
    void deleteAccount(Long id);
/*
    List<AdvertisementOwnedByAccount> retrieveAdvertisementOwnedByAccount(Long accountId);
*/
}
