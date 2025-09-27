package com.moviebooking.service;

import java.util.List;

import com.moviebooking.domain.Booking;
import com.moviebooking.form.BookingForm;

public interface BookingService {
	Booking saveBooking(Long movieId, BookingForm form);
	
	List<Booking> getAllBookings();
}
