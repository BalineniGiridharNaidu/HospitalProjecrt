package com.giridharan.appointmentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppointmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean(name = "doctorIds")
	public List<Integer> doctorIds() {
		return new ArrayList<>();
	}
	
	@Bean(name = "patientIds")
	public List<Integer> patientIds() {
		return new ArrayList<>();
	}

}
