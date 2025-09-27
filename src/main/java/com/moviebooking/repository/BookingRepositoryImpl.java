package com.moviebooking.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviebooking.domain.Booking;

@Repository
public class BookingRepositoryImpl implements BookingRepository {
	private final List<Booking> bookingList = new ArrayList<>();
	
	@Override
	public void save(Booking booking) {
		bookingList.add(booking);
	}
	
	@Override
	public List<Booking> findAll() {
		return new ArrayList<>(bookingList);
	}
}
