package com.example.managerUser.service;

import java.util.List;

import com.example.managerUser.entity.User;

public interface UserService {

	public List<User> findAllUser();

	public void addUser(User user);

}
