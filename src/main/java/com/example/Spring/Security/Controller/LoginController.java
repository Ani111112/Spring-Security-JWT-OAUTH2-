package com.example.Spring.Security.Controller;

import com.example.Spring.Security.Model.Customer;
import com.example.Spring.Security.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody Customer customer) {
        ResponseEntity response = null;
        Customer savedCustomer = loginService.signUp(customer);
        if (savedCustomer.getId() > 0) {
            response = new ResponseEntity<>("Registration Successfull", HttpStatus.ACCEPTED);
        }else {
            response = new ResponseEntity<>("Registration not successful", HttpStatus.BAD_REQUEST);
        }
        return response;
    }
}
