package com.springcore.javaconfig;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;

//@Component("firststudent")//bean name


public class Student {

	private Eat eat;

	public void study()
	
	{
		this.eat.display();
		System.out.println("Student is studying");
	}

	public Eat getEat() {
		return eat;
	}

	public void setEat(Eat eat) {
		this.eat = eat;
	}

	public Student(Eat eat) {
		super();
		this.eat = eat;
	}

}
