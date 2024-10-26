package com.giridharan.appointmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.appointmentService.entity.Patient_id;

@Repository
public interface patient_id_repo extends JpaRepository<Patient_id, Integer>{

}
