package com.code.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.boot.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public Department findBydepartmentName(String name);
	public Department findBydepartmentNameIgnoreCase(String name);
}