package com.capg.admin.restController;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.admin.model.Approval;
import com.capg.admin.service.AdminService;

@RestController
public class ApprovalRestController {

	@Autowired
	AdminService service;
	
	@GetMapping("/approval")
	public ResponseEntity giveApproval(@Validated @RequestBody Approval approval)
	{
		Approval ap=service.approval(approval.getReaction());
		
		if(Objects.nonNull(ap))
		{
			return ResponseEntity.ok().body("Seat Booked Successfully");
		}
		else
		{
			return ResponseEntity.ok().body("Sorry Your seat is not booked");
		}
	}
}
