package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/Autoconfig.xml");
	Employee employee=context.getBean("employee",Employee.class);
	System.out.println(employee);
}
}
