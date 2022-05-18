package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student details")
@Scope("prototype")//container create objects again and again for the same class when scope type is prototype and only once when scpe is singleton
public class Student {
	@Value("Poonam")
	private String studentName;
	@Value("Vijayawada")
	private String city;
	@Value("#{temp}")//Spring expression language
	private List<String> addresses;
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";

	}
}
