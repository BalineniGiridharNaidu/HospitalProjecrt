package com.giridharan.patientService.ExceptionsHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler
{	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<Object> m1(Throwable t)
	{	
		System.out.println(t.getMessage());
		return new ResponseEntity<Object>(t.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
