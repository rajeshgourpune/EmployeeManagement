package com.application.employee.dao;

import com.application.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);

    Employee findById(Integer id);

    public List<Employee> findAll();
}
