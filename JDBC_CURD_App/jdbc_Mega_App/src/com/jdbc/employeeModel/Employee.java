package com.jdbc.employeeModel;

public class Employee {
	private int id;
	private String eName;
	private String empAddress;
	private double empSalary;

	public Employee(String eName, String empAddress, double empSalary) {
		super();
		this.eName = eName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	
	public Employee(int id, String eName, String empAddress, double empSalary) {
		super();
		this.id = id;
		this.eName = eName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
