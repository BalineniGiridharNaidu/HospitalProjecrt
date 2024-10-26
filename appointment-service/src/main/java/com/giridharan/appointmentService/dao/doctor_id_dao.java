package com.giridharan.appointmentService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.giridharan.appointmentService.ArraysList.IdsArrays;
import com.giridharan.appointmentService.entity.Doctor_id;
import com.giridharan.appointmentService.repository.doctor_id_repo;

@Component
public class doctor_id_dao {
	
	@Autowired
	private doctor_id_repo direpo;
	
	@Autowired
	private IdsArrays idsArrays;
	
	public ResponseEntity<Object> save_doctor_id(Doctor_id doctor_id) throws Throwable {
		Doctor_id saved_doctor_id = direpo.save(doctor_id);
		Integer did = saved_doctor_id.getDoctor_id();
		if(did != null && did >0 )
			idsArrays.getDoctor_ids().add(did);
		return new ResponseEntity<Object>(saved_doctor_id, HttpStatus.CREATED);
	}

}
