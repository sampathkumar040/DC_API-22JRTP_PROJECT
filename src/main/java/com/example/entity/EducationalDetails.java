package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EducationDetails")

public class EducationalDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Education_Id;
	
	private String HighestDegree;
	
	private Integer GraduationYear;
	
	private String UniversityName;
	
	private Integer CaseNumber;

}
