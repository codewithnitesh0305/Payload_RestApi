package com.springboot.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot.CustomeException.BusinessException;
import com.springboot.CustomeException.EmptyInputFieldException;
import com.springboot.CustomeException.EmptyListException;

@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmptyInputFieldException.class)
	public ResponseEntity<String> handleEmptyField(EmptyInputFieldException exception){
		return new ResponseEntity<String>("Some input field are empty",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleIdNotExist(BusinessException exception){
		if(exception.getErrorCode() == "604") {
			return new ResponseEntity<String>("Invalid Id",HttpStatus.NOT_FOUND);
		}else if(exception.getErrorCode() == "605") {
			return new ResponseEntity<String>("Id not exist",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Id does not exist",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmptyListException.class)
	public ResponseEntity<String> handleListIsEmpty(EmptyListException exception){
		return new ResponseEntity<String>("No Data Found",HttpStatus.NOT_FOUND);
	}
}
