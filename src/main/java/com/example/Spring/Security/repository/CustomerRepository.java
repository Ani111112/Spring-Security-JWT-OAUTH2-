package com.example.Spring.Security.repository;

import com.example.Spring.Security.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer>findByEmail(String email);
}
