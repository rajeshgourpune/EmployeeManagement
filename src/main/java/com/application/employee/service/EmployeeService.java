package com.application.employee.service;

import com.application.employee.model.EmployeenDTO;
import com.application.employee.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface EmployeeService {

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Integer id);

    Employee findById(Integer id);

    List<Employee> getEmployeeList();
}
