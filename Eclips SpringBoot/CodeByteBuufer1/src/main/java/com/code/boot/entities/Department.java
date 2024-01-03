package com.code.boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	@NotBlank(message = "Please Provide Department Name")
	private String departmentName;
	private String departmentAdd;
	private String departmentPhone;
	private String departmentEmail;

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAdd() {
		return departmentAdd;
	}

	public void setDepartmentAdd(String departmentAdd) {
		this.departmentAdd = departmentAdd;
	}

	public String getDepartmentPhone() {
		return departmentPhone;
	}

	public void setDepartmentPhone(String departmentPhone) {
		this.departmentPhone = departmentPhone;
	}

	public String getDepartmentEmail() {
		return departmentEmail;
	}

	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(long departmentId, String departmentName, String departmentAdd, String departmentPhone,
			String departmentEmail) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAdd = departmentAdd;
		this.departmentPhone = departmentPhone;
		this.departmentEmail = departmentEmail;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAdd="
				+ departmentAdd + ", departmentPhone=" + departmentPhone + ", departmentEmail=" + departmentEmail + "]";
	}

}
