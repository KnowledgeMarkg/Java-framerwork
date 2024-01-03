package com.code.boot.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.boot.entities.Department;
import com.code.boot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department departmemnt) {
		// TODO Auto-generated method stub
		return departmentRepository.save(departmemnt);
	}
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	
	@Override
	public Department getDepartmentById(Long depId) {
		return departmentRepository.findById(depId).get();
	}
	@Override
	public void deleteDeptById(Long depId) {
		departmentRepository.deleteById(depId);
	}
	@Override
	public void deleteAll() {
		departmentRepository.deleteAll();
	}
	@Override
	public Department updateDepartment(Long deptId, Department department) {
		Department depData = departmentRepository.findById(deptId).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depData.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentEmail()) && !"".equalsIgnoreCase(department.getDepartmentEmail())) {
			depData.setDepartmentEmail(department.getDepartmentEmail());
		}
		
        if(Objects.nonNull(department.getDepartmentPhone()) &&!"".equalsIgnoreCase(department.getDepartmentPhone())) {
            depData.setDepartmentPhone(department.getDepartmentPhone());
        }
        if(Objects.nonNull(department.getDepartmentAdd()) &&!"".equalsIgnoreCase(department.getDepartmentAdd())) {
            depData.setDepartmentAdd(department.getDepartmentAdd());
        }
        return departmentRepository.save(depData);
	}
	@Override
	public Department getDeptByName(String name) {
		// TODO Auto-generated method stub
		return departmentRepository.findBydepartmentNameIgnoreCase(name);
	}

}