package com.moviebooking.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.domain.Booking;
import com.moviebooking.domain.BookingRequest;
import com.moviebooking.form.BookingForm;
import com.moviebooking.form.PaymentForm;
import com.moviebooking.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {
	private final BookingRepository bookingRepository;
	
	public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
	
	@Override
	public BookingRequest saveBookingReq(Long movieId, BookingForm form) {
		BookingRequest bookingReq = new BookingRequest();
		bookingReq.setMovieID(movieId);
		bookingReq.setCustomerName(form.getCustomerName());
		bookingReq.setPaymentMethod(form.getPaymentMethod());
		bookingReq.setSeatNumber(form.getSeatNumber());
		bookingReq.setTotalAmount(10000);
		
		bookingRepository.save(bookingReq);
		return bookingReq;
	}
	
	@Override
	public List<BookingRequest> getAllBookings() {
		return bookingRepository.findAll() ;
	}
	
	@Override
	public Booking createBooking(BookingRequest bookingRequest, PaymentForm paymentform) {
		Booking booking = new Booking();
		
		booking.setMovieID(bookingRequest.getMovieID());
		booking.setCustomerName(bookingRequest.getCustomerName());
		booking.setSeatNumber(bookingRequest.getSeatNumber());
		booking.setPaymentMethod(bookingRequest.getPaymentMethod());
		booking.setBookedAt(LocalDateTime.now());
		
		booking.setTotalAmount(10000);
		
		bookingRepository.saveBooking(booking);
		
		return booking;
	}
	
	@Override
	public List<Booking> getAllPayments() {
		return bookingRepository.findAllBookings();
	}
}
