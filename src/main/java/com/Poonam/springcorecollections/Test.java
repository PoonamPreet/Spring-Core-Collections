package com.Poonam.springcorecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new  ClassPathXmlApplicationContext("com/Poonam/springcorecollections/collectionsconfig.xml");
		Emp emp1=(Emp)context.getBean("Emp1");
		System.out.println("Name "+emp1.getEmpName());
		System.out.println("Address "+emp1.getAddress());
		System.out.println("Class "+emp1.getClass());//just to check class name
		System.out.println("Contacts "+emp1.getContacts());
		System.out.println("Courses "+emp1.getCourses());
		System.out.println("Props "+emp1.getProps());
		System.out.println("Contacts "+emp1.getContacts().getClass().getName());
	}

}
