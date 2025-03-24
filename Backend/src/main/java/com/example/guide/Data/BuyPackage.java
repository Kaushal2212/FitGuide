package com.example.guide.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuyPackage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BuyId")
	private Long buyId;
	
	@Column(name = "RollTag", unique = true, nullable = true)
	private Long rollTag;
	
	@Column(name="TrainerName")
	private String Name;
	
	@Column(name="Experience")
	private String experience;
	
	@Column(name="Charges")
	private String charges;

	public Long getBuyId() {
		return buyId;
	}

	public void setBuyId(Long buyId) {
		this.buyId = buyId;
	}

	public Long getRollTag() {
		return rollTag;
	}

	public void setRollTag(Long rollTag) {
		this.rollTag = rollTag;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}


	
	

}
