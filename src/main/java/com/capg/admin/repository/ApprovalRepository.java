package com.capg.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.admin.model.Approval;

public interface ApprovalRepository extends JpaRepository<Approval, Integer> {
	
	Approval findByReaction(String reaction);

}
