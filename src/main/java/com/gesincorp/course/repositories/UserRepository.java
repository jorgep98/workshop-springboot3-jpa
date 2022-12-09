package com.gesincorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gesincorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
