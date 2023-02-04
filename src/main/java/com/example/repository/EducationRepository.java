package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EducationalDetails;

public interface EducationRepository extends JpaRepository<EducationalDetails, Integer> {
	

}
