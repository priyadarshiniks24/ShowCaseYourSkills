package com.priya.web.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DataBaseErrorHandler {
	@ExceptionHandler(DataAccessException.class)
	public String handleDataAccessException(DataAccessException ex){
		ex.printStackTrace();
		return "error";
	}
}
