package com.moviebooking.repository;

import java.util.List;

import com.moviebooking.domain.Booking;


public interface BookingRepository {	
	void save(Booking booking);
	List<Booking> findAll();
}
