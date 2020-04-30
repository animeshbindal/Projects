package com.example.type4.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.type4.employee.Employee;
import com.example.type4.employee.dao.inte.EmployeeDaoInterface;
import com.example.type4.employee.service.inte.EmployeeServiceInterface;

@Component
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
	EmployeeDaoInterface empdao;
	 public Employee getEmpById(int id)
	 {
	  return empdao.getEmpById(id);
	 }
}
