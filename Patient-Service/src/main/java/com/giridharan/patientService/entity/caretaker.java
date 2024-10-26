package com.giridharan.patientService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class caretaker {
	@Id
	private Integer caretaker_id;
	private String caretaker_name;
}
