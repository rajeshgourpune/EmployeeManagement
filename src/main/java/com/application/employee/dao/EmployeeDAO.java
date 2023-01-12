package com.application.employee.dao;

import com.application.employee.model.Employee;
import com.application.employee.model.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Integer id);

    Employee findById(Integer id);

    public List<Employee> findAll();
}
