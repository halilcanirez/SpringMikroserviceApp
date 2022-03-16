package com.halil.secondhandapp.adapter.rest.accountcontroller;


import com.halil.secondhandapp.domain.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/user")
    public AccountResponse createUser(@RequestBody @Valid AccountCreateRequest user) {
        System.out.println(user.getFirstNAme());
        return AccountResponse.convertToResponse(
                accountService.createUser(user.convertToUser())
        );
    }

    @GetMapping("/user/{id}")
    public AccountResponse retrieveUser(@PathVariable Long id) {
        return AccountResponse.convertToResponse(accountService.retrieveUser(id)
        );
    }

    @DeleteMapping("/user")
    public void deleteUser(Long id) {
        accountService.deleteUser(id);
    }

    @GetMapping("/my-advertisement/{id}")
    public List<AdvertisementResponse> retrieveAdvertisementOwnedByAccount(@PathVariable Long id){
        return accountService.retrieveAdvertisementOwnedByAccount(id).stream()
                .map(AdvertisementResponse::convertToAdvertisementResponse)
                .collect(Collectors.toList());
    }
}
