package com.cg.sprint1.mvtktapp.sample1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sprint1.mvtktapp.sample1.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> 
{
}
