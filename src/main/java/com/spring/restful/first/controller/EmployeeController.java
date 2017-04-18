package com.spring.restful.first.controller;

import java.util.AbstractMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.first.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees/{id}/score")
	@ResponseStatus(HttpStatus.OK)
	AbstractMap.SimpleEntry<String, Double> getEmployeeByFilter(@PathVariable long id)  {
		
        double result = Math.random()*100+1;
        if(employeeRepository.findOne(id) == null)
        	return new AbstractMap.SimpleEntry<String, Double>("Maaf Id Tidak Ada", 0.0);
        else
        	return new AbstractMap.SimpleEntry<String, Double>("score", result);
	}
}
