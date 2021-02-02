package com.onlineshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.onlineshop.entities.Payment;

@Service
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
	