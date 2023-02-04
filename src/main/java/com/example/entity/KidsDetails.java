package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="KidsDetails")

public class KidsDetails {

	private Integer KidId;
	
	private String KidName;
	
	private Integer Age;
	
	private Integer SSN;
	
	private Integer CaseNumber;
	
}
