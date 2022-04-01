package com.db.spring4Homework.controller;

import com.db.spring4Homework.model.Customer;
import com.db.spring4Homework.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getById(@PathVariable Integer id)
    {
        return customerService.getById(id);
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customers){
        customerService.insert(customers);
        return customers;
    }
    @PostMapping("/customers/update")
    public Customer updateCustomer(@RequestBody Customer customers){
        customerService.update(customers);
        return customers;
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@RequestBody Customer customers){
        customerService.delete(customers);
    }
}
