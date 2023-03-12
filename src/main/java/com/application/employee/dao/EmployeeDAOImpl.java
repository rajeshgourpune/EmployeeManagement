package com.application.employee.dao;

import com.application.employee.model.Employee;
import com.application.employee.repository.EmployeeRepository;
import com.application.employee.util.CustomHibernateDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImpl extends CustomHibernateDaoSupport implements EmployeeDAO {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    // Del API
    @Override
    @Transactional
    public void delete(Employee employee){
        //getHibernateTemplate().delete(id);
        employeeRepository.delete(employee);

    }

    @Override
    public Employee findById(Integer id){
        Employee employee = new Employee();
        employee = employeeRepository.findById(id);
        return employee;
    }
}
