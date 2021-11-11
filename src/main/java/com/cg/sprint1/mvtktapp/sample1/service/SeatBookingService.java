package com.cg.sprint1.mvtktapp.sample1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.sprint1.mvtktapp.sample1.entity.SeatBooking;
import com.cg.sprint1.mvtktapp.sample1.repository.SeatBookingRepository;
@Service
public class SeatBookingService 
{
	@Autowired
	SeatBookingRepository seatBookingRepository;
	
	@Transactional(readOnly=true)
	public SeatBooking getBookingDetailsById(int bookingId)
	{
		Optional<SeatBooking> mvopt = seatBookingRepository.findById(bookingId);
		if(mvopt!=null)
			return mvopt.get();
		throw new RuntimeException("No booking is done by that id");
	}
//---------------------------------------------------------------------------------------------
	@Transactional
	public boolean addBookingDetails(SeatBooking seatBooking)
	{
		SeatBooking sbi = seatBookingRepository.save(seatBooking);
		return (sbi!=null);
	}
//--------------------------------------------------------------------------------------------------------	
	@Transactional
	public void removeBookingByID(int bookingId)
	{
			seatBookingRepository.deleteById(bookingId);
	}
//-------------------------------------------------------------------------------------------------------	
	
	
	
}
