package com.giridharan.appointmentService.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Doctor_id {
	@Id
	@GeneratedValue
	private Integer unique_doctor_id;
	private Integer doctor_id;
}
