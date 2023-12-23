package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String getContactInfo() {
        return "this is my contact details";
    }
}
