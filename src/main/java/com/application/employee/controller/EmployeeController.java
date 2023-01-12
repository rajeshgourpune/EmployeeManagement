package com.application.employee.controller;

import com.application.employee.model.Employee;
import com.application.employee.model.EmployeeDTO;
import com.application.employee.repository.EmployeeRepository;
import com.application.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @PostMapping(consumes = "application/json")
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @RequestMapping(value = "/employees/save", method = RequestMethod.POST,headers="Accept=application/json")
    public Employee saveEmployee(@RequestBody Employee employeeDTO)
    {
        List<EmployeeDTO> listOfEmployee = new ArrayList<EmployeeDTO>();
        return employeeService.save(employeenDTO);
    }

    @RequestMapping(value = "/employees/update", method = RequestMethod.POST,headers="Accept=application/json")
    public  void updateEmployee(@RequestBody Employee employeeDTO)
    {
        List<EmployeeDTO> listOfEmployee = new ArrayList<EmployeeDTO>();
        employeeService.update(employeeDTO);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET,headers="Accept=application/json")
    public List<Employee> getEmployeeList()
    {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee = employeeService.getEmployeeList();
        return listOfEmployee;
    }

}
