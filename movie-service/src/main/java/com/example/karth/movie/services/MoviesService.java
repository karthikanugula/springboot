package com.example.karth.movie.services;

import java.util.List;

import com.example.karth.movie.entity.Movies;

public interface MoviesService {
	
	Movies saveMovie(Movies mov);
	Movies updateMovie(Movies mov);
	void deleteMovieById(long movieId);
	Movies getMovieById(long movieId);
	List<Movies> getAllMovies(Movies mov);

}
