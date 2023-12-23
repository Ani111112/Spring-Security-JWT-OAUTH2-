package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public String myAccount() {
        return "this is my account";
    }
}
