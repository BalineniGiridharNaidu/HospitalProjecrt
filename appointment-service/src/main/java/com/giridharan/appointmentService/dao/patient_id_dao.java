package com.giridharan.appointmentService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.giridharan.appointmentService.ArraysList.IdsArrays;
import com.giridharan.appointmentService.entity.Patient_id;
import com.giridharan.appointmentService.repository.patient_id_repo;

@Component
public class patient_id_dao {
	
	@Autowired
	private patient_id_repo pidrepo;
	
	@Autowired
	private IdsArrays idsArrays;
	
	public ResponseEntity<Object> save_patient_id(Patient_id id) throws Throwable {
		Patient_id saved_patient_id = pidrepo.save(id);
		Integer pid = saved_patient_id.getPatient_id();
		if(pid != null && pid > 0)
				idsArrays.getPatient_ids().add(pid);
		return new ResponseEntity<Object>(saved_patient_id, HttpStatus.CREATED);
	}

}
