package com.example.spring_jdbc.repository;

import com.example.spring_jdbc.enity.Customer;

import java.util.List;

public interface CustomerRepository {
    public void insert(Customer customer);

    public int remove(Long phoneNo);

    public List<Customer> getAll();

    public int getCount();

    public int update(Long phoneNo, String address);

    public Customer get(Long phoneNo);
}
