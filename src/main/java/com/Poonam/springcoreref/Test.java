package com.Poonam.springcoreref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/Poonam/springcoreref/refconfig.xml");
	A a=(A)context.getBean("aref");
	 
	System.out.println(a.getX());
	System.out.println(a.getObj());
	System.out.println(a.getObj().getY());//getting obj of B class using a class ref obj
}
}
