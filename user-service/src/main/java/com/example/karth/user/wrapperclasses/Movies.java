package com.example.karth.user.wrapperclasses;

import java.util.Date;




public class Movies {
	
	private long movieId;
	private String movieName;
	private Date movieRelease;
	private String movieDirector;
	private String movieHero;
	
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getMovieRelease() {
		return movieRelease;
	}
	public void setMovieRelease(Date movieRelease) {
		this.movieRelease = movieRelease;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieHero() {
		return movieHero;
	}
	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}

}
