package com.rajat.app.ws.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler({UserServiceException.class})
	public ResponseEntity<Object> handleUserServiceException(UserServiceException ex , WebRequest request){
	 return new ResponseEntity<>(ex.getMessage(),new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
 }
	@ExceptionHandler({Exception.class})
	public ResponseEntity<Object> handleOtherException(Exception ex , WebRequest request){
	 System.out.println("data is here");
	 return new ResponseEntity<>(ex.getMessage(),new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
 }
}
