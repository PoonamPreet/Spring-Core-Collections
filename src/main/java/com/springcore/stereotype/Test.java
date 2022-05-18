package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereoconfig.xml");
		Student student=context.getBean("student details",Student.class);
		System.out.println(student);
		System.out.println(student.getAddresses());
		System.out.println(student.getAddresses().getClass().getName());
		System.out.println(student.hashCode());//the first has code
		Student student1=context.getBean("student details",Student.class);
		System.out.println(student1.hashCode());//the same hash code is given which is known as singleton 
		Teacher t1=context.getBean("teacher",Teacher.class);
		Teacher t2=context.getBean("teacher",Teacher.class);
		System.out.println("Teacher 1 "+t1.hashCode());
		System.out.println("Teacher 2 "+t2.hashCode());

	}
}
