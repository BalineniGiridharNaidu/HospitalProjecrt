package com.giridharan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giridharan.dao.patientDao;
import com.giridharan.entity.patient;

@Service
public class patientService
{
	private patientDao pdao;

	public patientService(patientDao pdao)
	{
		super();
		this.pdao = pdao;
	}
	
	public ResponseEntity<Object> save(patient p) throws Throwable
	{
		 return pdao.save(p);
	}
	
	public ResponseEntity<Object> deleteByPid(Integer pid) throws Throwable
	{
		 return pdao.deleteByPid(pid);
	}
	
	public ResponseEntity<Object> getByPid(Integer pid) throws Throwable
	{
		 return pdao.getByPid(pid);
	}
	
	public ResponseEntity<Object> getAll() throws Throwable
	{
		 return pdao.getAll();
	}
	
}
