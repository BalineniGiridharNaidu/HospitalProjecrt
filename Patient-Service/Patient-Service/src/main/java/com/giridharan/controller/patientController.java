package com.giridharan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giridharan.entity.patient;
import com.giridharan.service.patientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("patientController")
public class patientController
{	
	private patientService ps;

	public patientController(patientService ps)
	{
		super();
		this.ps = ps;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Object> save(@Valid @RequestBody patient p) throws Throwable
	{
		 return ps.save(p);
	}
	
	@DeleteMapping("/deleteByPid/{id}")
	public ResponseEntity<Object> deleteByPid(@PathVariable("id") Integer pid) throws Throwable
	{
		 return ps.deleteByPid(pid);
	}
	
	@GetMapping("/getByPid/{id}")
	public ResponseEntity<Object> getByPid(@PathVariable("id") Integer pid) throws Throwable
	{
		 return ps.getByPid(pid);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll() throws Throwable
	{
		 return ps.getAll();
	}
	
}
