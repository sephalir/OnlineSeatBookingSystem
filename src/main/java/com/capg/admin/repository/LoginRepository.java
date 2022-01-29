package com.capg.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.admin.model.Admin;

public interface LoginRepository extends JpaRepository<Admin, Integer>{
	
	Admin findByUsernameAndPassword(String username, String password);
}
