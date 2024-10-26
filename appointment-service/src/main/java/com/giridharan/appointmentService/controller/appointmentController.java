package com.giridharan.appointmentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giridharan.appointmentService.ArraysList.IdsArrays;
import com.giridharan.appointmentService.entity.appointment;
import com.giridharan.appointmentService.service.appointmentService;

@RestController
@RequestMapping("/appointmentController")
public class appointmentController {
	
	@Autowired
	private appointmentService aps;
	
	@Autowired
	private IdsArrays iarrays;
	
	@GetMapping("/getSavedDoctorIds")
	public ResponseEntity<List<Integer>> get_Saved_Doctor_Ids(){
		return new ResponseEntity<List<Integer>>(iarrays.getDoctor_ids(), HttpStatus.OK);
	}
	
	@GetMapping("/getSavedPatientIds")
	public ResponseEntity<List<Integer>> get_Saved_Patient_Ids(){
		return new ResponseEntity<List<Integer>>(iarrays.getPatient_ids(), HttpStatus.OK);
	}
	
	@PostMapping("/scheduleAppointment")
	public ResponseEntity<Object> scheduleAppointment(@RequestBody appointment a){
		 return aps.scheduleAppointment(a);
	}
}
