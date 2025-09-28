package com.moviebooking.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviebooking.domain.Booking;
import com.moviebooking.domain.BookingRequest;

@Repository
public class BookingRepositoryImpl implements BookingRepository {
	private final List<BookingRequest> bookingRequestList = new ArrayList<>();
	private final List<Booking> bookingList = new ArrayList<>();
	
	@Override
	public void save(BookingRequest bookingRequest) {
		bookingRequestList.add(bookingRequest);
	}
	
	@Override
	public List<BookingRequest> findAll() {
		return new ArrayList<>(bookingRequestList);
	}
	
	@Override
	public void saveBooking(Booking booking) {
		bookingList.add(booking);
	}
	
	@Override
	public List<Booking> findAllBookings() {
		return new ArrayList<>(bookingList);
	}
}
