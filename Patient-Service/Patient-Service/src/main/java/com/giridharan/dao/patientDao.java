package com.giridharan.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.giridharan.entity.patient;
import com.giridharan.repo.patientRepo;

@Component
public class patientDao
{
	private patientRepo prepo;

	public patientDao(patientRepo prepo)
	{
		super();
		this.prepo = prepo;
	}
	
	public ResponseEntity<Object> save(patient p) throws Throwable
	{
		 patient pp = prepo.save(p);
		 return new ResponseEntity<Object>(pp+" saved Successfully", HttpStatus.CREATED);
	}
	
	public ResponseEntity<Object> deleteByPid(Integer pid) throws Throwable
	{
		 prepo.deleteById(pid);
		 return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}
	
	public ResponseEntity<Object> getByPid(Integer pid) throws Throwable
	{
		 Optional<patient> pat = prepo.findById(pid);
		 return new ResponseEntity<Object>(pat.get(), HttpStatus.OK);
	}
	
	public ResponseEntity<Object> getAll() throws Throwable
	{
		 List<patient> pat = prepo.findAll();
		 return new ResponseEntity<Object>(pat, HttpStatus.OK);
	}
	
}
