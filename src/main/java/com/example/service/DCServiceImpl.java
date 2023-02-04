package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EducationalDetails;
import com.example.entity.IncomeDetails;
import com.example.entity.KidsDetails;
import com.example.entity.PlanSection;
import com.example.repository.EducationRepository;
import com.example.repository.IncomeRepository;
import com.example.repository.KidsRepository;
import com.example.repository.PlanRepository;

@Service
public class DCServiceImpl implements DCService{
	@Autowired
	private IncomeRepository  incomeRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private KidsRepository kidsRepository;
	@Autowired
	private PlanRepository planRepository;
	

	@Override
	public String saveIncomeDetails(IncomeDetails incomeDetails) {
		 incomeRepository.save(incomeDetails);
		return "IncomeDetails Saved";
	}

	@Override
	public String saveEducationDetails(EducationalDetails edDetails) {
		 educationRepository.save(edDetails);
		return "educationDetails Saved";
	}

	@Override
	public String saveKidsDetails(KidsDetails kidsDetails) {
		KidsDetails status = kidsRepository.save(kidsDetails);
		
		return "KidsDetails Saved";
	}

	@Override
	public String savePlanDetails(PlanSection planSection) {
		planRepository.save(planSection);
		return "PlanDetails Saved";
	}

}
