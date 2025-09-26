package com.bootcamp.demo.demo_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.demo.demo_database.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
  
}
