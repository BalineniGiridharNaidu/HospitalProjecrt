package com.giridharan.appointmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giridharan.appointmentService.entity.Patient_id;
import com.giridharan.appointmentService.service.patient_id_service;

@RestController
@RequestMapping("/patient_id_controller")
public class patient_id_controller {
	@Autowired
	private patient_id_service pis;
	
	@Autowired
	private Patient_id patient_id;
	
	@PostMapping("/save_patient_id/{id}")
	public ResponseEntity<Object> save_patient_id(@PathVariable Integer id) throws Throwable {
		patient_id.setPatient_id(id);
		return pis.save_patient_id(patient_id);
	}
	
}
