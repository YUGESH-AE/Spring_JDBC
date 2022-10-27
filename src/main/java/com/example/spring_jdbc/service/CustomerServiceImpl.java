package com.example.spring_jdbc.service;

import com.example.spring_jdbc.enity.Customer;
import com.example.spring_jdbc.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepositoryImpl customerRepository;

    @Override
    public void insert(Customer customer) {
        customerRepository.insert(customer);
    }

    @Override
    public int remove(Long phoneNo) {
        return customerRepository.remove(phoneNo);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public int getCount() {
        return customerRepository.getCount();
    }

    @Override
    public int update(Long phoneNo, String address) {
        return customerRepository.update(phoneNo,address);
    }

    @Override
    public Customer get(Long phoneNo) {
        return customerRepository.get(phoneNo);
    }
}
