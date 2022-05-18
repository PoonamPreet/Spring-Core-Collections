package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotatons {
	private String Example;

	public String getExample() {
		return Example;
	}

	public void setExample(String example) {
		Example = example;
	}

	@Override
	public String toString() {
		return "Annotatons [Example=" + Example + "]";
	}

	public Annotatons() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct//we should use javax annotation dependency to use this annotation
	public void start()
	{
		System.out.println("Starting");
	}
	@PreDestroy//we should use javax annotation dependency to use this annotation
	public void end()
	{
		System.out.println("Ending ");
	}
}
