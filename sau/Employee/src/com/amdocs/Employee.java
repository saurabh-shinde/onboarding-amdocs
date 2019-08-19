package com.amdocs;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	private Address data = new Address(String doorNo,String street, String city, String pinCode);
	
	public Employee(String name, String designation, String department, Address data) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.data = data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
