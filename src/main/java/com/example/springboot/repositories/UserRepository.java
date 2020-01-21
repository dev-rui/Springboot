package com.example.springboot.repositories;

import com.example.springboot.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
