package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="INCOMEDETAILS")
public class IncomeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer Income_ID;	
	
	private Integer MonthlyIncome;
	
	private Integer RentIncome;
	
	private Integer PropertyIncome;
	
	private Integer CaseNumber;

}
