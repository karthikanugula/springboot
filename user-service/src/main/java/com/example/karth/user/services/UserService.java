package com.example.karth.user.services;

import java.util.List;

import com.example.karth.user.entity.Users;

public interface UserService {
	
	Users saveUser(Users user);
	Users updateUser(Users user);
	void deleteUser(long userId);
	Users getUserById(long userId);
	List<Users> getAllUsers(Users user);

}
