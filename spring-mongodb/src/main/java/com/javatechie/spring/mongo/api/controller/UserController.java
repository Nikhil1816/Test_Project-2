package com.javatechie.spring.mongo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.javatechie.spring.mongo.api.entity.User;
import com.javatechie.spring.mongo.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
@PostMapping("/save")
public User saveUser(@RequestBody User user) {
	return userService.saveUser(user);
}
@GetMapping("/list")
public List<User> getUsers(@RequestBody User user){
	return userService.getUsers();
}
@PutMapping("/update/{user_id}")
public User updateUser(@RequestBody User user, @PathVariable("user_id") Long id) {
	return userService.updateUser(id, user);
}
@PutMapping("/delete/{user_id}")
public User deleteUser( User user, @PathVariable("user_id") Long id) {
	 userService.updateUser(id, user);
	 return null;
}

}
