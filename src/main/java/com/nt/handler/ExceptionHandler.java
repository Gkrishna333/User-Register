package com.nt.handler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(
			value = MethodArgumentNotValidException.class
			)
	public ResponseEntity<List<FieldError>> validErrorHandler(MethodArgumentNotValidException ex){
		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		return ResponseEntity.ok(fieldErrors);
	}
	
	
}
