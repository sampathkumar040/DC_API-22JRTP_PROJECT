package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PlanSection;

public interface PlanRepository extends JpaRepository<PlanSection, Integer> {

}
