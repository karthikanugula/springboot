package com.example.karth.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.karth.movie.entity.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {

}
