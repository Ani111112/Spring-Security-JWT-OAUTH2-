package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan")
    public String myLoans() {
        return "This all lones i have to pay";
    }
}
