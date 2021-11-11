package com.cg.sprint1.mvtktapp.sample1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="booked_seats")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="bookedSeatId")
public class BookedSeats 
{

	@Id
	@Column(name="booked_seat_id")
	String bookedSeatId;
	
	@Column(name="row_id")
	String rowId;
	
	@Column(name="booking_id")
	int bookingId;
	
	@Column(name="col_id")
	int columnId;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="booking_id",updatable=false,insertable=false)
	SeatBooking seatBooking;

	public BookedSeats() {
		super();
	}
	public BookedSeats(String bookedSeatId,int bookingId,String rowId, int columnId) 
	{
		super();
		this.bookedSeatId = bookedSeatId;
		this.bookingId = bookingId;
		this.rowId = rowId;
		this.columnId = columnId;
	}

	public String getBookedSeatId() {
		return bookedSeatId;
	}

	public void setBookedSeatId(String bookedSeatId) {
		this.bookedSeatId = bookedSeatId;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public int getColumnId() {
		return columnId;
	}

	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}

	public SeatBooking getSeatBooking() {
		return seatBooking;
	}

	public void setSeatBooking(SeatBooking seatBooking) {
		this.seatBooking = seatBooking;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
}
