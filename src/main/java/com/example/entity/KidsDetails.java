package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="KidsDetails")

public class KidsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer KidId;
	
	private String KidName;
	
	private Integer Age;
	
	private Integer SSN;
	
	private Integer CaseNumber;
	
}
