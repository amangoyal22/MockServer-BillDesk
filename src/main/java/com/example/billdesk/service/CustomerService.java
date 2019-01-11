package com.example.billdesk.service;

import com.example.billdesk.model.customer.Customer;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public Customer viewCustomer();
    public Customer modifyCustomer(Customer customer);
    public Customer deleteCustomer();
}
