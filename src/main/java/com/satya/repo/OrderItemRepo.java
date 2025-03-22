package com.satya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {

}
