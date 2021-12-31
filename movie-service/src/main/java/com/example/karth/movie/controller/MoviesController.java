package com.example.karth.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.karth.movie.entity.Movies;
import com.example.karth.movie.services.MoviesService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MoviesController {
	
	@Autowired
	MoviesService movService;
	
	Logger log = LoggerFactory.getLogger("LOG");
	
	@PostMapping("/createmovie")
	public Movies createMovie(@RequestBody Movies mov) {
		log.info("Inside createMovie method of MoviesController");
		return movService.saveMovie(mov);
	}

	@GetMapping("/{id}")
	public Movies getMovie(@PathVariable("id") long movieId) {
		log.info("Inside getMovie method of MoviesController");
		return movService.getMovieById(movieId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable("id") long movieId) {
		log.info("Inside deleteMovie method of MoviesController");
		movService.deleteMovieById(movieId);
	}
}
