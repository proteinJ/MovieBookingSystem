package com.moviebooking.repository;

import java.util.List;

import com.moviebooking.domain.Movie;

public interface MovieRepository {
	List<Movie> getAllMovieList();
}
