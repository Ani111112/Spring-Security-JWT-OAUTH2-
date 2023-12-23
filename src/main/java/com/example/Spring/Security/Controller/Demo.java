package com.example.Spring.Security.Controller;

import com.example.Spring.Security.SpringSecurityApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome To Spring Security";
    }
}
