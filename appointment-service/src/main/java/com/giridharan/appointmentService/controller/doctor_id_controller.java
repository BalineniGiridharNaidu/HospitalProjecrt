package com.giridharan.appointmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giridharan.appointmentService.entity.Doctor_id;
import com.giridharan.appointmentService.service.doctor_id_service;

@RestController
@RequestMapping("/doctor_id_controller")
public class doctor_id_controller {
	
	@Autowired
	private doctor_id_service dis;
	
	@Autowired
	private Doctor_id doctor_id;
	
	@PostMapping("/save_doctor_id/{id}")
	public ResponseEntity<Object> save_doctor_id(@PathVariable Integer id) throws Throwable {
		doctor_id.setDoctor_id(id);
		return dis.save_doctor_id(doctor_id);
	}
}
