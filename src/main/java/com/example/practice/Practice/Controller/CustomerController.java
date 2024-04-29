package com.example.practice.Practice.Controller;

import com.example.practice.Practice.DAO.CustomerRepository;
import com.example.practice.Practice.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @PostMapping("/createCustomer")
    public Customer createRecord(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }


}
