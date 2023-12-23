package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/balance")
    public String myBalance() {
        return "This is the Balance you have";
    }
}
