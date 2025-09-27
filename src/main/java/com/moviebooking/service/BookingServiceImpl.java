package com.moviebooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.domain.Booking;
import com.moviebooking.form.BookingForm;
import com.moviebooking.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {
	private final BookingRepository bookingRepository;
	
	public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
	
	public Booking saveBooking(Long movieId, BookingForm form) {
		Booking booking = new Booking();
		booking.setMovieID(movieId);
		booking.setCustomerName(form.getCustomerName());
		booking.setPaymentMethod(form.getPaymentMethod());
		booking.setSeatNumber(form.getSeatNumber());
		
		bookingRepository.save(booking);
		return booking;
	}
	
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll() ;
	}
}
