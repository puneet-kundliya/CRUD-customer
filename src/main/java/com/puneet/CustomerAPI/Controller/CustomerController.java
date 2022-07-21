package com.puneet.CustomerAPI.Controller;

import com.puneet.CustomerAPI.Entity.Customer;
import com.puneet.CustomerAPI.ServiceInterface.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/save")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer Details saved";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Customer getCustomer(@PathVariable("id") Integer id){
        Customer customer = customerService.getCustomer(id);
        return customer;
    }
    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public String updateCustomer(@RequestBody Customer customer, @PathVariable("id")Integer id){
        customerService.updateCustomer(id, customer);
        return "Customer updated " + id;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        Customer customer = customerService.getCustomer(id);
        customerService.deleteCustomer(id);
        return "Customer Deleted " + id;
    }
}