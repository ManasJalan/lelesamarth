package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.exceptions.NormalException;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Transactional
    public void registerCustomer(CustomerModel customerModel)
    {
        Customer customer = new Customer();
        if(Objects.isNull(customerRepository.findByEmailId(customerModel.getEmailId())));
        else
        {
        throw new NormalException("user is not valid");

        }
        customer.setEmailId(customerModel.getEmailId());

        customer.setFirstName(customerModel.getFirstName());
        customer.setLastName(customerModel.getLastName());
        customer.setPassword(customerModel.getPassword());


        customerRepository.save(customer);

    }

    public void loginCustomer(CustomerModel customerModel)
    {
        Customer customer=customerRepository.findByEmailId(customerModel.getEmailId());

        if (Objects.isNull(customer)) {
            throw new NormalException("user is not valid");
        }


        if(!customer.getPassword().equals( customerModel.getPassword()))
        {
            throw new NormalException("user password is not valid");
        }
    }
}
