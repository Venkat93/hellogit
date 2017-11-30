package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.DTO.EmployeeDTO;
import com.test.dao.EmployeeDAO;
import com.test.dao.UserDAO;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeValidator empValidator;
	
	@RequestMapping(method=RequestMethod.POST, value="/validate")
	public ModelAndView displayEmployeeDetails(String username,String password) {
		UserDAO uDAO=new UserDAO();
		ModelAndView mv;
		if(uDAO.isValidUser(username, password)) {
		mv=new ModelAndView();
		EmployeeDAO emDAO=new EmployeeDAO();
		List<EmployeeDTO> list=emDAO.getAllEmployeesList();
		mv.setViewName("LandingPage");
		mv.addObject("EmployeeList", list);
		return mv;
	}
		else {
			mv=new ModelAndView();
			mv.setViewName("Login");
			return mv;
		}
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/delete/{eno}")
	public ModelAndView delete(@PathVariable String eno) {
		ModelAndView mv=new ModelAndView();
		EmployeeDAO eDAO=new EmployeeDAO();
		eDAO.delete(eno);
		List<EmployeeDTO> list=eDAO.getAllEmployeesList();
		mv.setViewName("LandingPage");
		mv.addObject("EmployeeList", list);
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Insert")
	public ModelAndView insert() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("InsertEmployee");
		EmployeeDTO eDTO=new EmployeeDTO();
		mv.addObject("employee",eDTO);
		return mv;		
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/InsertEmployee")
	public ModelAndView InsertEmployee(EmployeeDTO employee, Errors errors) {
		ModelAndView mv=new ModelAndView();
		EmployeeDAO eDAO=new EmployeeDAO();
		EmployeeDTO eDTO=new EmployeeDTO();
		empValidator.validate(employee, errors);
		if(errors.hasErrors()) {
			mv.setViewName("InsertEmployee");
			mv.addObject("employee", eDTO);
			return mv;
		}
		else {
			eDAO.insert(employee.getEno(),employee.geteName(),employee.getSalary(),employee.getGender());;
			List<EmployeeDTO> list=eDAO.getAllEmployeesList();
			mv.setViewName("LandingPage");
			mv.addObject("EmployeeList", list);
			return mv;
			
		}
		
	}
}




