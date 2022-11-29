package com.te.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.transaction.service.EmployeeService;
import com.te.transaction.vo.EmployeeRequestVo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public String saveEmployee(@RequestBody EmployeeRequestVo employeeRequestVo) {
	  
		return employeeService.saveEmployee(employeeRequestVo);
	}
}
