package com.giridharan.appointmentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class appointment {
	@Id
	private Integer appointment_id;
	private Integer patient_id;
	private Integer doctor_id;
}
