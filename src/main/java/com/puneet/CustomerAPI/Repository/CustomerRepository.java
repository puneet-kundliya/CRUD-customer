package com.puneet.CustomerAPI.Repository;

import com.puneet.CustomerAPI.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository< Customer, Integer> {

    Customer getCustomerById(Integer id);
}
