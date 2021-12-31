package com.example.karth.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.karth.user.entity.Users;
import com.example.karth.user.services.UserServiceImpl;
import com.example.karth.user.wrapperclasses.ResponseTemplateData;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	Logger log = LoggerFactory.getLogger("Log");
	
	@PostMapping("/createuser")
	public Users createUser(@RequestBody Users user) {
		log.info("Inside createUser method of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public Users getUser(@PathVariable("id") long userId) {
		log.info("Inside getUser method of UserController");
		return userService.getUserById(userId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long userId) {
		log.info("Inside deleteUser method of UserController");
		userService.deleteUser(userId);
	}
	
	@GetMapping("/usermovie/{id}")
	public ResponseTemplateData getUserAndMovie(@PathVariable("id") long userId) {
		log.info("Inside getUserAndMovie method of UserController");
		return userService.getUserWithMovie(userId);
	}
}
