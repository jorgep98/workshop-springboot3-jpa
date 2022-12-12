package com.gesincorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gesincorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
