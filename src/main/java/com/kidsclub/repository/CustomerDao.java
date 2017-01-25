package com.kidsclub.repository;

import com.kidsclub.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
    Customer findByLogin(String login);
}
