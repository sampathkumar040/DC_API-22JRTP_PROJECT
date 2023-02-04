package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="INCOMEDETAILS")
public class IncomeDetails {
	
	private Integer Income_ID;	
	
	private Integer MonthlyIncome;
	
	private Integer RentIncome;
	
	private Integer PropertyIncome;
	
	private Integer CaseNumber;

}
