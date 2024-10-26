
package com.giridharan.doctorService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giridharan.doctorService.entity.doctor;
import com.giridharan.doctorService.service.doctorService;

@RestController
@RequestMapping("/doctorController")
public class doctorController {
	
	@Autowired
	private doctorService ds;
	
	@PostMapping("/saveDoctor")
	public ResponseEntity<Object> saveDoctor(@RequestBody doctor d){
		return ds.saveDoctor(d);
	}
}
