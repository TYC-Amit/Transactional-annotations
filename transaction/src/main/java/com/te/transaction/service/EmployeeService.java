package com.te.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.te.transaction.entity.Dept;
import com.te.transaction.entity.Employee;
import com.te.transaction.repo.DeptRepo;
import com.te.transaction.repo.EmployeeRepo;
import com.te.transaction.vo.EmployeeRequestVo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private DeptRepo deptRepo;
	
	@Transactional
	public String saveEmployee(EmployeeRequestVo employeeRequestVo) {
        
		Dept dept = new Dept();
		dept.setDeptName(employeeRequestVo.getDeptName());
		dept.setDeptCode(employeeRequestVo.getDeptName());
		Long deptId = deptRepo.save(dept).getDeptId();
		
		Employee employee = null;
		
		employee.setEmpName(employeeRequestVo.getEmpName());
		employee.setEmail(employeeRequestVo.getEmail());
		employee.setDeptId(deptId);
		
		employeeRepo.save(employee);
		return "Employee is saved with Employee ID :" +employee.getEmployeeId();
	}

}
