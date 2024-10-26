package com.giridharan.doctorService.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.giridharan.doctorService.entity.doctor;
import com.giridharan.doctorService.repository.doctorRepo;

@Component
public class doctorDao {
	
	@Autowired
	private doctorRepo drepo;
	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<Object> saveDoctor(doctor d) {
		doctor savedDoctor = drepo.save(d); //Doctor saved to database
		
		String url = "http://localhost:8083/doctor_id_controller/save_doctor_id/{did}";
		Map<String, String> pmap = new HashMap<>();
		pmap.put("did", String.valueOf(d.getDoctor_id()));
		restTemplate.exchange(
								url, // Address of the end point to be triggered
								HttpMethod.POST, // Type of the http method
								null, // HttpRequest is null, because in CURL syntax did will be replaced by doctor id directly
								Object.class, //Expecting response type
								pmap // Map to bind the parameters to the values for PathVariables and request parameters
							);
		return new ResponseEntity<Object>(savedDoctor, HttpStatus.CREATED);
	}
}
