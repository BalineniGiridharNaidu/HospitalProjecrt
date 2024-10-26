package com.giridharan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class aadhar
{	
	@Id
	private Integer aid;
	
	@Pattern(regexp = "^[2-9]{1}[0-9]{11}$", message = "Invalid Aadhaar number. It must be a 12-digit number starting with digits 2-9.")
	private Long anum;
}
