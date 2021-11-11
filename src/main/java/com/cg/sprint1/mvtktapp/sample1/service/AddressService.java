package com.cg.sprint1.mvtktapp.sample1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint1.mvtktapp.sample1.repository.AddressRepository;

@Service
public class AddressService 
{
	@Autowired
	AddressRepository addressRepository;
	
}
