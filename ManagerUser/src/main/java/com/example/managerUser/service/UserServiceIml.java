package com.example.managerUser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.managerUser.entity.User;
import com.example.managerUser.reponsitory.UserReponsitory;

@Service
public class UserServiceIml implements UserService {

	@Autowired
	UserReponsitory userReponsitory;
	
	@Override
	public List<User> findAllUser() {
		List<User> users=new ArrayList<>();
		users=userReponsitory.findAll();
		System.out.println(users);
		return users;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userReponsitory.save(user);
	} 
}
