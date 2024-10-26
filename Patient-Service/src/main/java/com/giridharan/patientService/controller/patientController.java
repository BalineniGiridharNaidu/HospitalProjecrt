package com.giridharan.patientService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.giridharan.patientService.entity.patient;
import com.giridharan.patientService.service.patientService;

@RestController
@RequestMapping("Patient-service")
public class patientController
{	
	@Autowired
	private patientService ps;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@PostMapping("/savePatient")
	public ResponseEntity<Object> save(@RequestBody patient p) throws Throwable
	{	
		System.out.println("In patient Controller");
		return ps.save(p);
	}
}
