package com.example.type4.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
 private int employeeid;
 private String employeename;
 private double employeesalary;
 @Autowired
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
 public Employee(int employeeid, String employeename, double employeesalary)
{
	 super();
	this.employeeid=employeeid;
	this.employeename=employeename;
	this.employeesalary=employeesalary;
}
public int getId() {
	return employeeid;
}
public void setId(int id) {
	this.employeeid = id;
}
public String getName() {
	return employeename;
}
public void setName(String name) {
	this.employeename = name;
}
public double getSalary() {
	return employeesalary;
}
public void setSalary(double salary) {
	this.employeesalary = salary;
}
 
}