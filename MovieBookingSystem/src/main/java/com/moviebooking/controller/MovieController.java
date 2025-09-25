package com.moviebooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.domain.Movie;
import com.moviebooking.service.MovieService;

@RestController
@RequestMapping("/movies")	
public class MovieController {
    private final MovieService movieService;
    
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    
    @GetMapping("/{id}")
    public Movie getMovieDetail(@PathVariable Long id) {
        return movieService.getMovieDetail(id);
    }
}