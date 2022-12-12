package com.gesincorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gesincorp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
