package com.moviebooking.service;

import java.util.List;

import com.moviebooking.domain.Booking;
import com.moviebooking.domain.BookingRequest;
import com.moviebooking.form.BookingForm;
import com.moviebooking.form.PaymentForm;

public interface BookingService {
	BookingRequest saveBookingReq(Long movieId, BookingForm form);
	List<BookingRequest> getAllBookings();
	
	Booking createBooking(BookingRequest bookingRequest, PaymentForm paymentform);
	List<Booking> getAllPayments();
	
}
