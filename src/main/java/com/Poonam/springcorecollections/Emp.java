package com.Poonam.springcorecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String>contacts;
	private Set<String> address;
	private Map<String,String> courses;
	private Properties props;




	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp(String empName, List<String> contacts, Set<String> address, Map<String, String> courses,
			Properties props) {
		super();
		this.empName = empName;
		this.contacts = contacts;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", contacts=" + contacts + ", address=" + address + ", courses=" + courses
				+ ", props=" + props + "]";
	}


}
