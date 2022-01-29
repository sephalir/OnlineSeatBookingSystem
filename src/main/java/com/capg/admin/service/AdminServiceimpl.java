package com.capg.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.admin.model.Admin;
import com.capg.admin.model.Approval;
import com.capg.admin.model.Seat;
import com.capg.admin.repository.ApprovalRepository;
import com.capg.admin.repository.LoginRepository;
import com.capg.admin.repository.SeatRepository;

@Service
public class AdminServiceimpl implements AdminService {
	
	@Autowired
	SeatRepository sero;
	
	@Autowired
	LoginRepository loro;
	
	@Autowired
	ApprovalRepository apro;
	
	public Optional<Seat> findById(int id) {
		// TODO Auto-generated method stub
		return sero.findById(id);
	}

	@Override
	public List<Seat> findByLocation(String location) {
		// TODO Auto-generated method stub
		return sero.findByLocation(location);
	}

	@Override
	public List<Seat> findByOffice(String office) {
		// TODO Auto-generated method stub
		return sero.findByOffice(office);
	}

	@Override
	public List<Seat> findByFloor(String floor) {
		// TODO Auto-generated method stub
		return sero.findByFloor(floor);
	}

	
	public Seat addSeat(Seat seat) {
		// TODO Auto-generated method stub
		Seat se=sero.save(seat);
		return se;
	}

	@Override
	public Approval approval(String reaction) {
		// TODO Auto-generated method stub
		return apro.findByReaction(reaction);
	}

	@Override
	public Admin login(String username, String password) {
		// TODO Auto-generated method stub
		return loro.findByUsernameAndPassword(username, password);
	}

}
