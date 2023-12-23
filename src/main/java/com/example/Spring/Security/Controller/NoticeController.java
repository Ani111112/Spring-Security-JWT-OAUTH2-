package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notice")
    public String notceBoard() {
        return "This is a Notice Page";
    }
}
