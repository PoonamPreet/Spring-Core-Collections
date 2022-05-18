package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//as we are using java class for configuration we will used Annoationconfigapplicationcontext
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);

		Student student=(Student)context.getBean("getStudents",Student.class);//bean name would be method name as method os annotated with bean
		System.out.println(student);
		student.study();
	}

}
