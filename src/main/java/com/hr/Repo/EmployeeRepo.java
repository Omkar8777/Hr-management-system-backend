package com.hr.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
 public Employee findByEmail(String email);
 
 
// public Employee findByName(String firstName);
 
}
