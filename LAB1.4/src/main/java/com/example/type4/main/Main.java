package com.example.type4.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.type4.employee.Employee;
import com.example.type4.employee.service.inte.EmployeeServiceInterface;
import com.example.type4.employeeService.EmployeeService;

public class Main {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.org.lab1");
		context.refresh();
		 Scanner s=new Scanner(System.in);
		  System.out.println("Enter the id number");
		  int id= s.nextInt();
		  
		  EmployeeServiceInterface service= context.getBean(EmployeeService.class);
		  Employee emp= service.getEmpById( id);
		  
		  if(emp!=null)
		  {
			  System.out.println("show the detail");
			  System.out.println("employee id"+" ="+ emp.getId());
			  System.out.println("employee name"+" ="+ emp.getName());
			  System.out.println("employee salary"+" ="+ emp.getSalary());
		  }
		  else
		  {
			  System.out.println("wrong id");
		  }
	}
}
