package com.giridharan.patientService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.patientService.entity.patient;

@Repository
public interface patientRepo extends JpaRepository<patient, Integer>
{
	
}
