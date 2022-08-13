package com.revature.spring.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spring.backend.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
