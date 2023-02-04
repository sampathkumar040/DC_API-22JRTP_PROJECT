package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PlanSedtion")
public class PlanSection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CaseNumber;
	
	private String PlanName;  

}
