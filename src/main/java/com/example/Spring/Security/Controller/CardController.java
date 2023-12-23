package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @GetMapping("/card")
    public String myCards() {
        return "This all cards i have";
    }
}
