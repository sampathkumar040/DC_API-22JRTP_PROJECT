package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.KidsDetails;

public interface KidsRepository extends JpaRepository<KidsDetails, Integer> {

}
