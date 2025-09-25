package com.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebooking.domain.Movie;
import com.moviebooking.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;
	public List<Movie> getAllMovieList() {
		return movieRepository.getAllMovieList();
	}
	
	@Override
    public Movie getMovieDetail(Long id) {
        return movieRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("영화를 찾을 수 없습니다."));
    }
}

