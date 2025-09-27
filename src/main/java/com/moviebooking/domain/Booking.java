package com.moviebooking.domain;

public class Booking {
	private Long id;
    private Long MovieID;
    private String seatNumber;
    private String customerName;
    private String PaymentMethod;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMovieID() {
		return MovieID;
	}
	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
}
