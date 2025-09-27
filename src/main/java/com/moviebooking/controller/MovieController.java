package com.moviebooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moviebooking.domain.Movie;
import com.moviebooking.service.MovieService;

@Controller
@RequestMapping("/movies")	
public class MovieController {
    private final MovieService movieService;
    
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    
    @GetMapping("/booking/{id}")
    public String booking(@PathVariable("id") Long id, Model model) {
    	Movie movie = movieService.getMovieDetail(id);
        model.addAttribute("movie", movie);
        
        return "movieBooking";
    }
    
    @PostMapping("/booking/{id}")
    
    @GetMapping("/{id}")
    public String getMovieDetail1(@PathVariable("id") Long id, Model model) {
    	Movie movie = movieService.getMovieDetail(id);
        model.addAttribute("movie", movie);
        
        return "movieDetail";
    }
}