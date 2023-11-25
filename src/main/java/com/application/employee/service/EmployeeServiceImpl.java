package com.application.employee.service;

import com.application.employee.dao.EmployeeDAO;
import com.application.employee.model.Employee;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeDAO employeeDAO;


    @Override
    public Employee save(Employee employee) {
        logger.debug("EmployeeServiceImpl::::save::>>");
        Employee employee1 = new Employee();
        employee1 = employeeDAO.save(employee );
        return employee1;
    }

    @Override
    public Employee update(Employee employee) {
        logger.debug("EmployeeServiceImpl::::update::>>");
        Employee employee1 = new Employee();
        employee1 = employeeDAO.update(employee );
        return employee1;
    }

    @Override

    public void delete(Employee employee) {
        // Del API
        employeeDAO.delete(employee);
    }

    @Override
    public Employee findById(Integer id) {
        logger.debug("EmployeeServiceImpl::::findById::>>");
        Employee employee= employeeDAO.findById(id);
        return employee;
    }

    public List<Employee> getEmployeeList(){
        //Get All employee
        logger.debug("EmployeeServiceImpl::::getEmployeeList::>>");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList = employeeDAO.findAll();
        return employeeList;
    }



}
