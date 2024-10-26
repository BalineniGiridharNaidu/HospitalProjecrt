package com.giridharan.patientService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.patientService.dao.patientDao;
import com.giridharan.patientService.entity.patient;

@Service
public class patientService
{	
	@Autowired
	private patientDao pdao;
	
	public ResponseEntity<Object> save(patient p) throws Throwable
	{	
		System.out.println("In patient service class");
		return pdao.save(p);
	}
}
