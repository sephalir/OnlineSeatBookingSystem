package com.capg.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capg.admin.model.Admin;
import com.capg.admin.model.Approval;
import com.capg.admin.model.Seat;

@Service
public interface AdminService {
	public Seat addSeat(Seat seat);
	
	public Optional<Seat> findById(int id);
	
	public List<Seat> findByLocation(String location);
	
	public List<Seat> findByOffice(String office);
	
	public List<Seat> findByFloor(String floor);
	
	public Approval approval(String reaction);
	
	
	public Admin login(String username, String password);

}
