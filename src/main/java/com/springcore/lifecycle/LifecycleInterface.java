package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleInterface implements InitializingBean,DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LifecycleInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LifecycleInterface [price=" + price + "]";
	}

	
	//used for  init methods initialization
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init after properties");
	}
	//used for  init methods initialization
	public void destroy() throws Exception {
		System.out.println("Destroy in disposable bean");
	}
	
}
