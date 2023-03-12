package com.application.employee.service;

import com.application.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee save(Employee employee);

    Employee update(Employee employee);

    // Del API
    void delete(Employee employee);

    Employee findById(Integer id);

    List<Employee> getEmployeeList();

}
