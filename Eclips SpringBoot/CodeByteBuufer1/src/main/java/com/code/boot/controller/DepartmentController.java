package com.code.boot.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code.boot.entities.Department;
import com.code.boot.error.ResourceNotFoundException;
import com.code.boot.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public  Department saveDepartment(@Valid @RequestBody Department departmemnt) {
		return departmentService.saveDepartment(departmemnt);
	}
	@GetMapping("/getDep")
	public List<Department> getDepartment(){
		return departmentService.getDepartment();
	}
	
	@GetMapping("/getDepById/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long depId) {
	    Department departmentById = departmentService.getDepartmentById(depId);
	    if (Objects.isNull(departmentById)) {
	        throw new ResourceNotFoundException("Department not found with id: " + depId);
	    }
	    return new ResponseEntity<>(departmentById, HttpStatus.OK);
	}

	@DeleteMapping("/deletedepat/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long depId) {
		departmentService.deleteDeptById(depId);
		return "Deleted";
	}
	
	@DeleteMapping("deletedepat")
	public String deleteAll() {
		departmentService.deleteAll();
        return "Deleted All";
	}
	@PutMapping("/updateDept/{id}")
	public Department updateDepartment(@PathVariable("id") Long deptId, @RequestBody Department department) {
		return departmentService.updateDepartment(deptId, department);
	}
	@GetMapping("/getDepByName/{name}")
	public Department getDeptByName(@PathVariable("name") String DdeptName) {
		Department deptByName = departmentService.getDeptByName(DdeptName);
		if(!Objects.isNull(deptByName)) {
			return deptByName;
		}else {
			return null;
		}
	}
}
