package com.training.Service4.serviceImpl;

import com.training.Service4.model.Customer;
import com.training.Service4.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceImpl  implements CustomerService {
    @Override
    public List<Customer> getAll() {
        List<Customer>getAll = new ArrayList<>();
        Customer C1 = new Customer(201,"sgygw23","Delhi",263653);
        Customer C2 = new Customer(202,"sgtt6123","Uttrakhand",223456);
        Customer C3 = new Customer(203,"susyegw44","Noida",3876543);
        getAll.add(C1);
        getAll.add(C2);
        getAll.add(C3);
        return null;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customer;
    }

    @Override
    public Customer deleteCustomer(int id) {
        return null;
    }
}
