package com.puneet.CustomerAPI.ServiceImplementation;

import com.puneet.CustomerAPI.Entity.Customer;
import com.puneet.CustomerAPI.Repository.CustomerRepository;
import com.puneet.CustomerAPI.ServiceInterface.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    @Override
    public Customer getCustomer(Integer id) {
        Customer customer = customerRepository.getCustomerById(id);
        return customer;
    }
    @Override
    public void updateCustomer(Integer custId, Customer customer) {
        Customer oldCustomer = customerRepository.getCustomerById(custId);
        if(!customer.getEmail().equals(null)){
            oldCustomer.setEmail(customer.getEmail());
        }
        if (!customer.getPassword().equals(null)){
            oldCustomer.setPassword(customer.getPassword());
        }
        if(!customer.getUserName().equals(null)){
            oldCustomer.setUserName(customer.getUserName());
        }
        customerRepository.save(oldCustomer);
    }
    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

}
