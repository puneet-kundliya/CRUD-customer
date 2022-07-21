package com.puneet.CustomerAPI.Repository;

import com.puneet.CustomerAPI.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository< Customer, Integer> {

    Customer getCustomerById(Integer id);
}
