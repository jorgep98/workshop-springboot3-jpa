package com.gesincorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gesincorp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
