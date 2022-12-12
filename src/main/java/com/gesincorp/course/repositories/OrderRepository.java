package com.gesincorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gesincorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
