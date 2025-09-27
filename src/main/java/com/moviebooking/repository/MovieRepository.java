package com.moviebooking.repository;

import java.util.List;
import java.util.Optional;

import com.moviebooking.domain.Movie;

public interface MovieRepository {
	List<Movie> getAllMovieList();
	
	Optional<Movie> findById(Long id);
}
