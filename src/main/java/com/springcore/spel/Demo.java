package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")//we can pass expressions which is called spring expression language
	private int x;
	@Value("#{22+12}")//we can pass expressions which is called spring expression language
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")//value of square root will be given here //invoking static methods using spring expression language
	private double z;
	
	@Value("#{T(java.lang.Math).E}")//E is static value in math class same like pi 
	//@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	
	@Value("#{new java.lang.String('Poornima')}")//Object creation using expression language
	private String name;
	
	@Value("#{8>3}")//such expression should be given where value is boolean type
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
