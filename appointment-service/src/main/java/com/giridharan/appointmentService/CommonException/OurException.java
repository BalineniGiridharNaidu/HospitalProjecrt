package com.giridharan.appointmentService.CommonException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OurException
{	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<Object> m1(Throwable t)
	{
		return new ResponseEntity<Object>(t, HttpStatus.BAD_REQUEST);
	}
}
