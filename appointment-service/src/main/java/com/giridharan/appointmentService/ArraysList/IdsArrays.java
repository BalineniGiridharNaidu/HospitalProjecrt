package com.giridharan.appointmentService.ArraysList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.giridharan.appointmentService.entity.Doctor_id;
import com.giridharan.appointmentService.entity.Patient_id;
import com.giridharan.appointmentService.repository.doctor_id_repo;
import com.giridharan.appointmentService.repository.patient_id_repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class IdsArrays {
	
	@Autowired
	@Qualifier("doctorIds")
	private List<Integer> doctor_ids;
	
	@Autowired
	@Qualifier("patientIds")
	private List<Integer> patient_ids;
	
	
	private patient_id_repo prepo;
	private doctor_id_repo drepo;
	
	
	@Autowired
	public IdsArrays(patient_id_repo prepo, doctor_id_repo drepo) {
		super();
		this.prepo = prepo;
		this.drepo = drepo;
	}
	
	{
		for(Patient_id p : prepo.findAll()) {
			patient_ids.add(p.getPatient_id());
		}
		
		for(Doctor_id d : drepo.findAll()) {
			doctor_ids.add(d.getDoctor_id());
		}
	}
	
//	public IdsArrays() {
//		this.doctor_ids = doctor_ids;
//		this.patient_ids = patient_ids;
//	}
	
	public void addPatientId(Integer pid) {
		patient_ids.add(pid);
	}
	
	public void addDoctorId(Integer did) {
		doctor_ids.add(did);
	}

}
