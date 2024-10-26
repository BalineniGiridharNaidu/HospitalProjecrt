package com.giridharan.doctorService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class doctor
{	
	@Id
	private Integer doctor_id;
	private String doctor_name;
	private String doctor_qualification;
}
