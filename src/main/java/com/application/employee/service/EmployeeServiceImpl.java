package com.application.employee.service;

import com.application.employee.dao.EmployeeDAO;
import com.application.employee.model.EmployeeDTO;
import com.application.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;


    @Override
    public Employee save(Employee employee) {
        Employee employee1 = new Employee();
        employee1 = employeenDAO.save(employee );
        return employee1;
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1 = new Employee();
        employee1 = employeeDAO.update(employee );
        return employee1;
    }

    @Override

    public void delete(Integer id) {
        employeeDAO.delete(id );
    }

    @Override
    public Employee findById(Integer id) {
        Employee employee= employeeDAO.findById(id);
        return employee;
    }

    public List<Employee> getEmployeeList(){
        //Get All employee
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList = employeeDAO.findAll();
        return employeeList;
    }
}
