package com.nithya.onlinegroceryshopping.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nithya.onlinegroceryshopping.entity.User;
import com.nithya.onlinegroceryshopping.service.UserService;


@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {

	@Autowired
	public UserService userService;
	//5
	@GetMapping("/user/{userId}")
	public ResponseEntity<User> getUser(@PathVariable int userId) {
		User user= userService.getUser(userId);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	//1
	@PostMapping("/user")
	public User addProduct(@RequestBody User user) {
		return userService.create(user);
	}
	
	//2
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> user = userService.getAllUser();
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	//3
	@PutMapping("/user")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return ResponseEntity.ok("Updated");
	}
	
	//4
	@DeleteMapping("/user")
	public ResponseEntity<String> deleteUser(@RequestBody User user) {
		userService.deleteUser(user.getUserId());
		return ResponseEntity.ok("Deleted");
	}
	

	
	
}
