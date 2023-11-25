package com.application.employee.controller;

import com.application.employee.model.Employee;
import com.application.employee.model.EmployeeDTO;
import com.application.employee.repository.EmployeeRepository;
import com.application.employee.service.EmployeeService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @GetMapping
    public Iterable<Employee> findAll() {
        logger.info("EmployeeController::::findAll::>>");
        return employeeRepository.findAll();
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.POST)
    @PostMapping(consumes = "application/json")
    public Employee create(@RequestBody Employee employee) {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee = employeeService.getEmployeeList();
        logger.info("EmployeeController::::create::>>");
        return employeeRepository.save(employee);
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.POST)
    @RequestMapping(value = "/employees/save", method = RequestMethod.POST,headers="Accept=application/json")
    public Employee saveEmployee(@RequestBody Employee employeeDTO)
    {
        logger.info("EmployeeController::::saveEmployee::>>");
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee = employeeService.getEmployeeList();
        Employee employee2 = listOfEmployee.stream().reduce((a, b) -> a.getId() > b.getId() ? a : b).get();
        int maxId = employee2.getId();
        employeeDTO.setId(maxId+1);//save call
        return employeeService.save(employeeDTO);
    }
    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.PUT)
    @RequestMapping(value = "/employees/update", method = RequestMethod.PUT,headers="Accept=application/json")
    public  void updateEmployee(@RequestBody Employee employeeDTO)
    {
        logger.info("EmployeeController::::updateEmployee::>>");
        List<EmployeeDTO> listOfEmployee = new ArrayList<EmployeeDTO>();
        employeeService.update(employeeDTO);
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @RequestMapping(value = "/employees", method = RequestMethod.GET,headers="Accept=application/json")
    public List<Employee> getEmployeeList()
    {
        logger.info("EmployeeController::::getEmployeeList::>>");
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee = employeeService.getEmployeeList();
        return listOfEmployee;
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.GET)
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    public Employee getEmployeeDetails(@PathVariable int id)
    {
        logger.info("EmployeeController::::getEmployeeDetails::>>");
        Employee employeedetails = new Employee();
        employeedetails = employeeService.findById(id);
        return employeedetails;
    }

    @CrossOrigin( origins = "http://localhost:3000",methods = RequestMethod.DELETE)
    @RequestMapping(value = "/employees/delete/{id}", method = RequestMethod.DELETE,headers="Accept=application/json")
    public  void deleteEmployee(@PathVariable int id)
    {
        //delete API
        logger.info("EmployeeController::::deleteEmployee::>>");
        Employee employeedetails = new Employee();
        employeedetails = employeeService.findById(id);
        employeeService.delete(employeedetails);
    }

}
