package com.cg.sprint1.mvtktapp.sample1.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.sprint1.mvtktapp.sample1.entity.ClassSeats;
import com.cg.sprint1.mvtktapp.sample1.repository.ClassSeatsRepository;
@Service
public class ClassSeatsService 
{
	@Autowired
	ClassSeatsRepository classSeatsRepository;
	
	@Transactional(readOnly=true)
	public List<ClassSeats> getAllSeats()
	{
		List<ClassSeats> seats = classSeatsRepository.findAll();
		if(seats.size()>0)
			return seats;
		throw new RuntimeException("No seats Available");
	}
	
	public ClassSeats getById(String class_seats_id)
	{
		Optional<ClassSeats> seats = classSeatsRepository.findById(class_seats_id);
		if(seats!=null)
			return seats.get();
		throw new RuntimeException("No ceats found by that ID");
	}
}
