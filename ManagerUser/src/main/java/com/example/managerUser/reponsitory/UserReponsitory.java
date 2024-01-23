package com.example.managerUser.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.managerUser.entity.User;

public interface UserReponsitory  extends JpaRepository<User, Integer>{

	
}
