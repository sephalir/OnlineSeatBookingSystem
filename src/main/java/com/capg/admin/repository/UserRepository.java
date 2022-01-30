package com.capg.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.capg.admin.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByUsernameAndPassword(String getuserName,String password);
	@Modifying
	@Query("update User u set u.username=inputName,u.password=inputpassword,u.address = inputAddress,u.contact_no = inputContact_no")
	void setUser(String username,String password,String address,String contact_no);
}
