package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.IncomeDetails;

public interface IncomeRepository extends JpaRepository<IncomeDetails, Integer> {

}
