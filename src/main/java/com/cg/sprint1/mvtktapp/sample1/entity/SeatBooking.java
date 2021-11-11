package com.cg.sprint1.mvtktapp.sample1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="seat_booking")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="bookingId")
public class SeatBooking 
{
	@Id
	@Column(name="booking_id")
	int bookingId;
	
	@Column(name="cust_mobileno")
	String customerMobileId;
	
	@Column(name="booking_date")
	String bookingDate;
	
	@Column(name="show_date")
	String showDate;
	
	@Column(name="show_theatre_id")
	String showTheatreId;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="booking_id",updatable=false,insertable=false)
	List<BookedSeats> bookedSeats;

	@OneToOne
	@JoinColumn(name="show_theatre_id",updatable=false,insertable=false)
	Show show;
	
	public SeatBooking() {}
	public SeatBooking(int bookingId, String customerMobileId,String showTheatreId,String bookingDate,String showDate,List<BookedSeats> bookedSeats) 
	{
		super();
		this.bookingId = bookingId;
		this.customerMobileId = customerMobileId;
		this.showTheatreId=showTheatreId;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.bookedSeats= bookedSeats;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerMobileId() {
		return customerMobileId;
	}

	public void setCustomerMobileId(String customerMobileId) {
		this.customerMobileId = customerMobileId;
	}


	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public List<BookedSeats> getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(List<BookedSeats> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	public String getShowTheatreId() {
		return showTheatreId;
	}
	public void setShowTheatreId(String showTheatreId) {
		this.showTheatreId = showTheatreId;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	
}
