package com.capg.admin.service;

import org.springframework.stereotype.Service;

import com.capg.admin.model.User;

@Service
public interface UserService {
	
	public User addUser(User user);
	public User login(String username,String password);
	public User updateUser(User user);
}
