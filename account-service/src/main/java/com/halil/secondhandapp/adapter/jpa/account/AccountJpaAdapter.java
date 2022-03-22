package com.halil.secondhandapp.adapter.jpa.account;

import com.halil.secondhandapp.domain.account.AdvertisementOwnedByAccount;
import com.halil.secondhandapp.domain.exception.ExceptionType;
import com.halil.secondhandapp.domain.exception.SecondhandDataNotFoundException;
import com.halil.secondhandapp.domain.port.AccountPersistencePort;
import com.halil.secondhandapp.domain.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountJpaAdapter implements AccountPersistencePort {

    private final AccountJpaRepository accountJpaRepository;

    @Override
    public Account createAccount(Account account) {
        return accountJpaRepository.save(AccountEntity.convert_to_AccountEntity(account)).convertToAccount();
    }

    @Override
    public Account retrieveAccount(Long id) {
        return retrieveAccountById(id).convertToAccount();
    }

    @Override
    public void deleteAccount(Long id) {
         accountJpaRepository.deleteById(id);
    }

    private AccountEntity retrieveAccountById(Long id){
        return accountJpaRepository.findById(id)
                .orElseThrow(()-> new SecondhandDataNotFoundException(ExceptionType.ACCOUNT_DATA_NOT_FOUND));
    }
}
