package com.training.Service4.service;

import com.training.Service4.model.Customer;

import java.util.List;

public interface CustomerService {
     public  List<Customer> getAll();
     public  Customer addCustomer (Customer customer);
     public  Customer updateCustomer (Customer customer);
     public  Customer deleteCustomer (int id);

}
