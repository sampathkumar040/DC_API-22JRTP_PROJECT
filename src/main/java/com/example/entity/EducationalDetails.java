package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EducationDetails")

public class EducationalDetails {
	
	private Integer Education_Id;
	
	private String HighestDegree;
	
	private Integer GraduationYear;
	
	private String UniversityName;
	
	private Integer CaseNumber;

}
