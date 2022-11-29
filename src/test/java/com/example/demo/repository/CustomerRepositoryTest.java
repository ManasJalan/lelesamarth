package com.example.demo.repository;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void saveCustomer()
    {




        Customer customer=Customer.builder()
                .emailId("Jalan@ok.com")
                .firstName("Manas")
                .build();
        customerRepository.save(customer);

    }

    @Test
    public void updateCustomerNameByEmailIdTest()
        {
        customerRepository.updateCustomerNameByEmailId("Manasupdate","Jalantest1@ok.com");
    }
    @Test
    public void printCustomers()
    {
        List<Customer> customers=customerRepository.findAll();
        System.out.println("customers "+ customers);
    }
}