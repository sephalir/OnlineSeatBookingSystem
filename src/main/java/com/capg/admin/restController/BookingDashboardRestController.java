package com.capg.admin.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.admin.model.Seat;
import com.capg.admin.service.AdminService;

@RestController
public class BookingDashboardRestController {
	
	
	@Autowired
	AdminService service;
	
	@PostMapping("/addSeatDetails")
	public ResponseEntity<Seat> createSeat(@Validated @RequestBody Seat seat)
	{
		Seat s=service.addSeat(seat);
		ResponseEntity.ok().body("Seat Details added Successfully");
		return new ResponseEntity<Seat>(s,HttpStatus.OK);
	}
	
	@GetMapping("/getSeatById")
	public Optional<Seat> showSeatById(@Validated @RequestBody Seat seat)
	{
		return service.findById(seat.getSeatId());
		
	}
	
	@GetMapping("/getSeatByLocation")
	public List<Seat> showSeatByLocation(@Validated @RequestBody Seat seat)
	{
		return service.findByLocation(seat.getLocation());
		
	}
	
	@GetMapping("/getSeatByOffice")
	public List<Seat> showSeatByOffice(@Validated @RequestBody Seat seat)
	{
		return service.findByOffice(seat.getOffice());
		
	}
	
	@GetMapping("/getSeatByFloor")
	public List<Seat> showSeatByFloor(@Validated @RequestBody Seat seat)
	{
		List<Seat> se=service.findByFloor(seat.getFloor());
		return se;
		
	}


}
