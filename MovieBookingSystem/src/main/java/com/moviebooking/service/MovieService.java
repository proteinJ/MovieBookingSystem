package com.moviebooking.service;

import java.util.List;

import com.moviebooking.domain.Movie;

public interface MovieService {
	List<Movie> getAllMovieList();
	
	Movie getMovieDetail(Long id);
}
