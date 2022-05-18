package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certificate;
	private List<String> list;


	//Constructor injection
	public Person(String name,int personId,Certificate certificate,List <String> list)
	{
		this.name=name;
		this.personId=personId;
		this.certificate=certificate;
		this.list=list;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certificate=" + certificate + ", list=" + list
				+ "]";
	}


}
