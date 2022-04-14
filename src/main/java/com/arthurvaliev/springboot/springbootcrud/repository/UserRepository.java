package com.arthurvaliev.springboot.springbootcrud.repository;

import com.arthurvaliev.springboot.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
