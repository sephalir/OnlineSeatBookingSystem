package com.capg.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="approval")
public class Approval {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String reaction;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	@Override
	public String toString() {
		return "Approval [id=" + id + ", reaction=" + reaction + "]";
	}
	
	
	
	

}

