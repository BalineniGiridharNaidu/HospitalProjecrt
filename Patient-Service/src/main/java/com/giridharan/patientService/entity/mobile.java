package com.giridharan.patientService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class mobile {
	@Id
	private Integer mobile_id;
	private String mobile_type;
	private Long mobile_num;
}
