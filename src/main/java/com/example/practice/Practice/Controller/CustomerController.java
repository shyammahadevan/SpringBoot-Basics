package com.example.practice.Practice.Controller;

import com.example.practice.Practice.Controller.DAO.CustomerRepository;
import com.example.practice.Practice.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @PostMapping("/createCustomer")
    public Customer createRecord(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }


}
