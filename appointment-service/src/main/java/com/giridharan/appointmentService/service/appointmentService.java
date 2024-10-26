package com.giridharan.appointmentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.appointmentService.dao.appointmentDao;
import com.giridharan.appointmentService.entity.appointment;

@Service
public class appointmentService {
	
	@Autowired
	private appointmentDao adao;

	public ResponseEntity<Object> scheduleAppointment(appointment a) {
		return adao.scheduleAppointment(a);
	}
}
