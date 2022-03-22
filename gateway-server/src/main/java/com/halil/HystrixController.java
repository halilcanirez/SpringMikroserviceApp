package com.halil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fb")
public class HystrixController {

    @GetMapping("/account")
    public String accountFallback(){
        return "Something went wrong";
    }

    @GetMapping("/advertisemnt")
    public String ticketFallback(){
        return "Something went wrong.";
    }
