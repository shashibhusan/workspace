package com.handling;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	private String INCORRECT_REQUEST="INCORRECT_REQUEST";
	private String BAD_REQUEST="BAD_REQUEST";
	  
	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<ErrorResponse> handleUserNotFoundException(RecordNotFoundException ex, WebRequest request)
	{
		List<String>details=new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error=new ErrorResponse(INCORRECT_REQUEST, details);
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(MissingHeaderInfoException.class)
	public final ResponseEntity<ErrorResponse> handleInvalidTraceIdException(MissingHeaderInfoException ex,WebRequest request)
	{
		List<String>details=new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error=new ErrorResponse(BAD_REQUEST, details);
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}
	
	@Override  
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)   
	{  
		System.out.println("============CustomExceptionHandler.handleMethodArgumentNotValid().status========="+status);
		ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(),"Validation failed", ex.getBindingResult().toString());  
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);  
	}   
	
}
