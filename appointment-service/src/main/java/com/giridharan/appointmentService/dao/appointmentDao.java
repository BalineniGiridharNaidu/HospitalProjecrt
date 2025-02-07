package com.giridharan.appointmentService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.giridharan.appointmentService.entity.appointment;
import com.giridharan.appointmentService.repository.appointmentRepo;

@Component
public class appointmentDao {
	
	
	private appointmentRepo arepo;
	
	
	public appointmentDao() {
		super();
	}
	
	@Autowired
	public appointmentDao(appointmentRepo arepo) {
		super();
		this.arepo = arepo;
	}



	public ResponseEntity<Object> scheduleAppointment(appointment a) {
		appointment savedAppointment = arepo.save(a);
		return new ResponseEntity<Object>(savedAppointment, HttpStatus.CREATED);
	}
}
