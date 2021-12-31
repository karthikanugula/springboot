package com.example.karth.user.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.karth.user.entity.Users;
import com.example.karth.user.repository.UserRepository;
import com.example.karth.user.wrapperclasses.Movies;
import com.example.karth.user.wrapperclasses.ResponseTemplateData;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	Logger log = LoggerFactory.getLogger("Log");
	
	@Override
	public Users saveUser(Users user) {
		log.info("Inside SaveUser method of UserServiceImpl");
		return userRepo.save(user);
		}

	@Override
	public Users updateUser(Users user) {
		log.info("Inside updateUser method of UserServiceImpl");
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(long userId) {
		log.info("Inside deleteUser method of UserServiceImpl");
		userRepo.deleteById(userId);

	}

	@Override
	public Users getUserById(long userId) {
		log.info("Inside getUserById method of UserServiceImpl");
		return userRepo.findById(userId).get();
	}

	@Override
	public List<Users> getAllUsers(Users user) {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public ResponseTemplateData getUserWithMovie(long userId) {
		
		ResponseTemplateData resTemp = new ResponseTemplateData();
		Users user = userRepo.findById(userId).get();
		Movies movie = restTemplate.getForObject("http://movie-services:8082/movies/" + user.getMovieId(),
				Movies.class);
		
		resTemp.setUser(user);
		resTemp.setMovie(movie);
		
		return resTemp;
	}
}
