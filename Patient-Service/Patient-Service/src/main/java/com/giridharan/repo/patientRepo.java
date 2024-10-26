package com.giridharan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.entity.patient;

@Repository
public interface patientRepo extends JpaRepository<patient, Integer>
{
	
}
