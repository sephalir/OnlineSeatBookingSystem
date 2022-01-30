package com.capg.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.admin.model.User;
import com.capg.admin.repository.UserRepository;

@Service
public class UserServiceimpl implements UserService
{


	@Autowired
	UserRepository repo;
	

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User user1 = repo.save(user);
		return user1;
	}

	@Override
	public User login(String username, String password) {
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
		
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}
	
}
