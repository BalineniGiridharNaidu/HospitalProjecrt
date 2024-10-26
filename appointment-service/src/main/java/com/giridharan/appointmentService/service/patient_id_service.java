package com.giridharan.appointmentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.appointmentService.dao.patient_id_dao;
import com.giridharan.appointmentService.entity.Patient_id;

@Service
public class patient_id_service {
	@Autowired
	private patient_id_dao pidao;
	
	public ResponseEntity<Object> save_patient_id(Patient_id id) throws Throwable {
		
		return pidao.save_patient_id(id);
	}

}
