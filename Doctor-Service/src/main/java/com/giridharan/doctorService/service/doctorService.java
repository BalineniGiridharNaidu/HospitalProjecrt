package com.giridharan.doctorService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.doctorService.dao.doctorDao;
import com.giridharan.doctorService.entity.doctor;

@Service
public class doctorService {
	@Autowired
	private doctorDao ddao;

	public ResponseEntity<Object> saveDoctor(doctor d) {
		return ddao.saveDoctor(d);
	}
}
