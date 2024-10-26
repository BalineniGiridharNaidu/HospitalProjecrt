package com.giridharan.patientService.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class patient
{	
	@Id
	private Integer patient_id;
	private String patient_name;
	private String patient_condition;
	//-------------------------------------------------------
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_patient_caretaker_id")
	private List<caretaker> pcaretakers;
	//-------------------------------------------------------
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_patient_mobile_id")
	private List<mobile> pmobiles;
	//-------------------------------------------------------
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_patient_bed_id")
	private bed patient_bed;
}
