package com.onlineshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshop.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
