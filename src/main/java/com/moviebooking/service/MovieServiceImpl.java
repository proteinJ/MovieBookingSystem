package com.moviebooking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		final Logger log = LoggerFactory.getLogger(MovieService.class);
		log.info("영화 상세정보 요청: id={}", id);
        return movieRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("영화를 찾을 수 없습니다."));
    }
}

