package com.giridharan.appointmentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.appointmentService.dao.doctor_id_dao;
import com.giridharan.appointmentService.entity.Doctor_id;

@Service
public class doctor_id_service {
	
	@Autowired
	private doctor_id_dao ddao;
	
	public ResponseEntity<Object> save_doctor_id(Doctor_id doctor_id) throws Throwable {
		return ddao.save_doctor_id(doctor_id);
	}

}
