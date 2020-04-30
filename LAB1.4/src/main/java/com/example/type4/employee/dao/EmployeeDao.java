package com.example.type4.employee.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.type4.collection.Collection;
import com.example.type4.employee.Employee;
import com.example.type4.employee.dao.inte.EmployeeDaoInterface;

@Component
public class EmployeeDao implements EmployeeDaoInterface{
ApplicationContext me =new AnnotationConfigApplicationContext(Collection.class);

public Employee getEmpById(int id)
{
List<Employee> empList= (List<Employee>) me.getBean("getEmpList");
for(Employee emp:empList)
{
	if (emp.getId()==id)
	{
		return emp;
	}
}
return null;

}
}
