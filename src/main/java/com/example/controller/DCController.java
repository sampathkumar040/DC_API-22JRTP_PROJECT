package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DCService;

@RestController
public class DCController {
	@Autowired
	private DCService dcService;

}
