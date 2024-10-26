package com.giridharan.appointmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.appointmentService.entity.Doctor_id;

@Repository
public interface doctor_id_repo extends JpaRepository<Doctor_id, Integer>{
	
}
