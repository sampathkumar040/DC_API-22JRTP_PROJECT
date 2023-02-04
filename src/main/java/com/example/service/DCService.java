package com.example.service;

import com.example.entity.EducationalDetails;
import com.example.entity.IncomeDetails;
import com.example.entity.KidsDetails;
import com.example.entity.PlanSection;

public interface DCService {
	
	public String saveIncomeDetails(IncomeDetails incomeDetails);
	
	public String saveEducationDetails(EducationalDetails edDetails);

	public String saveKidsDetails(KidsDetails kidsDetails);
	
	public String savePlanDetails(PlanSection planSection);
}
