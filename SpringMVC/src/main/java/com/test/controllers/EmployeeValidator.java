package com.test.controllers;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.DTO.EmployeeDTO;

@Component
public class EmployeeValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object obj, Errors errors) {
		
		EmployeeDTO eDTO=(EmployeeDTO)obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"eno", "eno.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eName", "eName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "salary", "salary.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required");
		
	
		
		if(eDTO.getEno()==0 && eDTO.getEno() < 1000)
		{
			errors.rejectValue("eno", "eno.min"); //error key "fee.min
		}
		
	}
	 
	
}

