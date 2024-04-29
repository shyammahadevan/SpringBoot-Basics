package com.example.practice.Practice.DAO;


import com.example.practice.Practice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
