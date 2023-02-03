package com.training.Service4.controller;

import com.training.Service4.model.Customer;
import com.training.Service4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/db")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/get")
  public List<Customer> getAll(){
      return customerService.getAll();
  }
  @PostMapping("/add")
  public  Customer addCustomer(@RequestBody Customer customer)
  {
      return  customerService.addCustomer(customer);
  }

    @PutMapping ("/update")
    public  Customer updateCustomer(@RequestBody Customer customer)
    {
        return  customerService.updateCustomer(customer);
    }


}
