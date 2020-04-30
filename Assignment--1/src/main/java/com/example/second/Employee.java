package com.example.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int employeeid;
	  private String employeename;
	  private double salary;
	  private int age;
	  @Autowired
	  private SBU SBU;
	public int getemployeeId() {
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
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public SBU getSBU() {
		return SBU;
	}
	public void setSBU(SBU sBU) {
		SBU = sBU;
	}
	public void show()
	{
		System.out.println("Employee"+"["+"employeeAge"+"="+30+"employeeID"+"="+1234+"employeename"+"="+"Harriet"+"empSalary"+"="+40000.0);
		SBU.compile();
	}
	  
}
