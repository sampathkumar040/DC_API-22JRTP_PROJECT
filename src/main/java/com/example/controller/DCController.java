package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PlanSection;
import com.example.service.DCService;

@RestController
public class DCController {
	@Autowired
	private DCService dcService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveDetails(PlanSection planSection){
		String status = dcService.savePlanDetails(planSection);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
