package com.giridharan.patientService.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.giridharan.patientService.entity.patient;
import com.giridharan.patientService.repository.patientRepo;

@Component
public class patientDao
{	
	@Autowired
	private patientRepo prepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<Object> save(patient p) throws Throwable
	{	
		System.out.println("In patient DAO");
		patient savedPatient = prepo.save(p);
		String url = "http://localhost:8083/patient_id_controller/save_patient_id/{id}";
		//HttpEntity<patient> requestEntity = new HttpEntity<>(p);
		
		Map<String,String> hmap = new HashMap<>();
		//        variable  -----> value
		hmap.put("id", String.valueOf(p.getPatient_id()));
		
		restTemplate.exchange(
								url, // Resource URL Address
								HttpMethod.POST, // HttpMethod Type
								null, // Representation of patient Object as HttpHeaders and HttpBody
								Object.class, // What type of response You are expecting from the target
								hmap // Map to bind the path variables to their values
							 );
		//restTemplate.postForEntity("http://localhost:8083/patient_id_controller/save_patient_id/{id}", savedPatient.getPatient_id(), Integer.class, );
		return new ResponseEntity<Object>(savedPatient, HttpStatus.OK);
	}
}
