package com.moviebooking.form;

public class BookingForm {
	private String customerName;
	private String seatNumber;
	private String PaymentMethod;
	
	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public BookingForm() {}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String userName) {
		this.customerName = userName;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}
