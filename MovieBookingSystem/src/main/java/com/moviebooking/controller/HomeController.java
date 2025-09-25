package com.moviebooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.moviebooking.domain.Movie;
import com.moviebooking.repository.MovieRepository;

@Controller
public class HomeController {
    private final MovieRepository movieRepository;

    // 생성자 주입 방식
    public HomeController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Movie> movieList = movieRepository.getAllMovieList();	
        model.addAttribute("movieList", movieList);

        return "index";
    }
}