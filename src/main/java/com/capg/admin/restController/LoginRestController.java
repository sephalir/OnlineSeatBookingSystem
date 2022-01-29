package com.capg.admin.restController;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.admin.model.Admin;
import com.capg.admin.service.AdminService;

@RestController
public class LoginRestController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/login")
	public ResponseEntity createAdmin(@Validated @RequestBody Admin admin)
	{
		Admin ad=service.login(admin.getUsername(), admin.getPassword());
		
		if(Objects.nonNull(ad))
		{
			return ResponseEntity.ok().body("Login successfully");
		}
		else {
			return ResponseEntity.ok().body("Incorrect username or password");
		}
		
	}

}


