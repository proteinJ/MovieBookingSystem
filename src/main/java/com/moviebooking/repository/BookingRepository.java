package com.moviebooking.repository;

import java.util.List;

import com.moviebooking.domain.Booking;
import com.moviebooking.domain.BookingRequest;


public interface BookingRepository {
	void save(BookingRequest bookingRequest);
	void saveBooking(Booking booking);
	
	// BookingRequest
	List<BookingRequest> findAll();
	// Booking
    List<Booking> findAllBookings();
}
