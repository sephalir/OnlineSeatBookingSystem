package com.capg.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.admin.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer>{

	List<Seat> findByLocation(String location);

	List<Seat> findByOffice(String office);

	List<Seat> findByFloor(String floor);
	

}
