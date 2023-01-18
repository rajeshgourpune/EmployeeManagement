package com.application.employee.repository;

import com.application.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "com.application.employee.model.Employee")
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
