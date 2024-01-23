package com.example.managerUser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.managerUser.entity.User;
import com.example.managerUser.reponsitory.UserReponsitory;
import com.example.managerUser.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	UserReponsitory userReponsive;

	@GetMapping("/get")
	public List<User> getAllUser() {
		return userService.findAllUser();
	}
	// Thêm người dùng vào nhé
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		userService.addUser(user);
		return user;
	}

	// Tim thong tin theo id
	@GetMapping("/get/{id}")
	public User findByIdUser(@PathVariable Integer id) {
		Optional<User> optional = userReponsive.findById(id);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			new RuntimeException("Khong co user theo id này");
		}

		return user;
	}
}
