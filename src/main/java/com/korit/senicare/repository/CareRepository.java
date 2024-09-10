package com.korit.senicare.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.korit.senicare.entity.CareRecordEntity;

import jakarta.persistence.Entity;

public interface CareRepository extends JpaRepository<CareRecordEntity, Integer> {

    
}
