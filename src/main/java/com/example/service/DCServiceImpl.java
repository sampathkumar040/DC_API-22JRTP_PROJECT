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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveEducationDetails(EducationalDetails edDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveKidsDetails(KidsDetails kidsDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savePlanDetails(PlanSection planSection) {
		// TODO Auto-generated method stub
		return null;
	}

}
