package com.puneet.CustomerAPI.ServiceInterface;

import com.puneet.CustomerAPI.Entity.Customer;

public interface CustomerService {

    void saveCustomer(Customer customer);
    Customer getCustomer(Integer id);

    void deleteCustomer(Integer id);

    void updateCustomer(Integer id, Customer customer);
}
