package com.giridharan.commonExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionCatcher
{	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> m1(Exception e)
	{
		return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
	}
}
