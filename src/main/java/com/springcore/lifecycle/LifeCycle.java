package com.springcore.lifecycle;

public class LifeCycle 
{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println("Setting property....");
		return "LifeCycle [price=" + price + "]";
	}

	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}


}
