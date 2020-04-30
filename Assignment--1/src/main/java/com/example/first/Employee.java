package com.example.first;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int employeeid;
	  private String employeename;
	  private double salary;
	  private String busineessUnit ;
	  public String getBusineessUnit() {
		return busineessUnit;
	}
	public void setBusineessUnit(String busineessUnit) {
		this.busineessUnit = busineessUnit;
	}
	private int age;
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
	public void show()
	{
		System.out.println("Employee id"+" ="+12345);
		System.out.println("Employee Name"+"="+ "Harriet");
		System.out.println("Employee Salary"+"="+ 40000.0);
		System.out.println("Employee BU"+"="+ "PES-BU");
		System.out.println("Employee Age"+"="+30);
	}
	  
}
