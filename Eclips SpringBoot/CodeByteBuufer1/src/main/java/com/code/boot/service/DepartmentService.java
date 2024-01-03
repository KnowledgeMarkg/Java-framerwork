package com.code.boot.service;

import java.util.List;

import com.code.boot.entities.Department;

public interface DepartmentService {

	public Department saveDepartment(Department departmemnt);

	public List<Department> getDepartment();

	public Department getDepartmentById(Long depId);

	public void deleteDeptById(Long depId);

	public void deleteAll();

	public Department updateDepartment(Long deptId, Department department);

	public Department getDeptByName(String name);
}
