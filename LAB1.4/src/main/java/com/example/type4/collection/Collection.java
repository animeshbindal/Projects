package com.example.type4.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.type4.employee.*;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(100, "Animesh",5000.0));
		empList.add(new Employee(101,"Aman",6000.0));
		empList.add(new Employee(112,"Ajeet", 7000.0));
		empList.add(new Employee(113,"Hemant",3000.0));
		
		return empList;
	}
}
