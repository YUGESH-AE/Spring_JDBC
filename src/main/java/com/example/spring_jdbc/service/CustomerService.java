package com.example.spring_jdbc.service;

import com.example.spring_jdbc.enity.Customer;

import java.util.List;

public interface CustomerService {
    public void insert(Customer customer);

    public int remove(Long phoneNo);

    public List<Customer> getAll();

    public int getCount();

    public int update(Long phoneNo, String address);

    public Customer get(Long phoneNo);
}
