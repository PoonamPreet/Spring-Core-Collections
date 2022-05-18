package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//configuration
//commenting this as we r not using component annotation in Student class for bean definition
//@ComponentScan(basePackages = "com.springcore.javaconfig")//specifying base package
public class JavaConfig {
	
	@Bean
	public Eat getEat()
	{
		return new Eat();
	}
	
	@Bean//(name= {"student","temp","con"}) naming bean when we dont want to use method name as bean name
	//we have to change bean name in getbean method
	public Student getStudents()
	{
		//creating a new object of student class
		Student student=new Student(getEat());
		
		return student;
	}
	
}
