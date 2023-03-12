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

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @GetMapping
    public Iterable<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.POST)
    @PostMapping(consumes = "application/json")
    public Employee create(@RequestBody Employee employee) {

        return employeeRepository.save(employee);
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.POST)
    @RequestMapping(value = "/employees/save", method = RequestMethod.POST,headers="Accept=application/json")
    public Employee saveEmployee(@RequestBody Employee employeeDTO)
    {
        List<EmployeeDTO> listOfEmployee = new ArrayList<EmployeeDTO>();
        return employeeService.save(employeeDTO);
    }
    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.PUT)
    @RequestMapping(value = "/employees/update", method = RequestMethod.PUT,headers="Accept=application/json")
    public  void updateEmployee(@RequestBody Employee employeeDTO)
    {
        List<EmployeeDTO> listOfEmployee = new ArrayList<EmployeeDTO>();
        employeeService.update(employeeDTO);
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @RequestMapping(value = "/employees", method = RequestMethod.GET,headers="Accept=application/json")
    public List<Employee> getEmployeeList()
    {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee = employeeService.getEmployeeList();
        return listOfEmployee;
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    public Employee getEmployeeDetails(@PathVariable int id)
    {
        Employee employeedetails = new Employee();
        employeedetails = employeeService.findById(id);
        return employeedetails;
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.DELETE)
    @RequestMapping(value = "/employees/delete/{id}", method = RequestMethod.DELETE,headers="Accept=application/json")
    public  void deleteEmployee(@PathVariable int id)
    {
        Employee employeedetails = new Employee();
        employeedetails = employeeService.findById(id);
        employeeService.delete(employeedetails);
    }

}
