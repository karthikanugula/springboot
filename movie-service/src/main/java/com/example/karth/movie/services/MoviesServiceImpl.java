package com.example.karth.movie.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.karth.movie.entity.Movies;
import com.example.karth.movie.repository.MoviesRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MoviesServiceImpl implements MoviesService {
	
	@Autowired
	private MoviesRepository movRepo;
	
	Logger log= LoggerFactory.getLogger("LOG");
	
	@Override
	public Movies saveMovie(Movies mov) {
		log.info("Inside saveMovie method of MoviesServiceImpl class");
		return movRepo.save(mov);
	}

	@Override
	public Movies updateMovie(Movies mov) {
		log.info("Inside updateMovie method of MoviesServiceImpl class");
		return movRepo.save(mov);
	}

	@Override
	public void deleteMovieById(long movieId) {
		log.info("Inside deleteMovie method of MoviesServiceImpl class");
		movRepo.deleteById(movieId);

	}

	@Override
	public Movies getMovieById(long movieId) {
		log.info("Inside getMovieById method of MoviesServiceImpl class");
		return movRepo.findById(movieId).get();
	}

	@Override
	public List<Movies> getAllMovies(Movies mov) {
		log.info("Inside getAllMovies method of MoviesServiceImpl class");
		return movRepo.findAll();
	}

}
