package com.moviebooking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moviebooking.domain.Booking;
import com.moviebooking.domain.Movie;
import com.moviebooking.form.BookingForm;
import com.moviebooking.service.BookingService;
import com.moviebooking.service.MovieService;

@Controller
@RequestMapping("/movies")	
public class MovieController {
    private final MovieService movieService;
    private final BookingService bookingService;

    
    public MovieController(MovieService movieService, BookingService bookingService) {
        this.movieService = movieService;
        this.bookingService = bookingService;
    }
    
    // 영화 상세 정보 페이지
    @GetMapping("/{id}")
    public String getMovieDetail1(@PathVariable("id") Long id, Model model) {
    	Movie movie = movieService.getMovieDetail(id);
        model.addAttribute("movie", movie);
        
        return "movieDetail";
    }
    
    
    // 영화 예약(예매) 페이지
    @GetMapping("/booking/{id}")
    public String booking(@PathVariable("id") Long id, Model model) {
        Movie movie = movieService.getMovieDetail(id);
        model.addAttribute("movie", movie);
        model.addAttribute("bookingForm", new BookingForm());
        return "movieBooking";
    }
    
    @PostMapping("/booking/{id}")
    public String postBooking(@PathVariable("id") Long movieId,
    						  @ModelAttribute BookingForm bookingForm,    						
    						  Model model) {   
        Booking booking = bookingService.saveBooking(movieId, bookingForm);
        model.addAttribute("success", booking);
        
        return "bookingSuccess";
    }

}