package com.giridharan.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
	
	@NotNull
	@NotBlank
	private String patient_name;
	
	@NotNull
	@NotBlank
	private String patient_condition;
	
	@Positive
	private Integer patient_age;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_patient_address_id")
	private address patient_address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable (
			name = "patient_doctor",
			joinColumns = {@JoinColumn(name = "pat_id")},
			inverseJoinColumns = {@JoinColumn(name = "doc_id")}
	        )
	private List<doctor> patdoc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_pat_care")
	private List<caretaker> patcare;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_pat_aadhar")
	private aadhar pataadhar;
}
