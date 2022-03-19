package com.halil.client;
import com.halil.contract.AccountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-service")
public interface AccountServiceClient {
    @RequestMapping("/user/{id}")
    AccountResponse retrieveUser(@PathVariable Long id);
}
