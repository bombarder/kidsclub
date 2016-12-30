package com.kidsclub.repository;

import com.kidsclub.model.Order;
import com.kidsclub.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long> {
     Order findByCustomerIdAndStatus(Long customerId, OrderStatus status);
}
