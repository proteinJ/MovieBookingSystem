package com.moviebooking.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviebooking.domain.Booking;

@Repository
public interface BookingRepository {	
	void save(Booking booking);
	List<Booking> findAll();
}
