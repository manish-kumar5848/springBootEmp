package com.emp_mongo.controllers;
import com.emp_mongo.model.Employee;
import com.emp_mongo.repository.impl.EmployeeQueryDaoImpl;
import com.emp_mongo.services.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeQueryDaoImpl employeeQueryDao;

    @Autowired
    EmployeeServiceImpl employeeService;
//  @Autowired
//  private employeeRepository repository;

    @GetMapping("/emp")
    public List<Employee> getEmployees() {
//        return  repository.findAll();
//        System.out.println("getempHit");
        return this.employeeService.getAll();
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") String id) {
        return this.employeeService.getEmployeeById(id);
//     return repository.findById(id);
    }

    @PostMapping("/emp")
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee emp;
        emp = this.employeeService.addEmployee(employee);
        return emp;

    }

    @DeleteMapping("/emp/{employeeId}")
    public void removeEmployee(@PathVariable("employeeId") String employeeId) {
        this.employeeService.removeEmployee(employeeId);

    }

    //    ///update employee
    @PutMapping("/emp/{id}")
    public Employee updateEmpl(@RequestBody Employee updatedEmp, @PathVariable("id") String id) {
        this.employeeService.updateEmployee(updatedEmp, id);
        return updatedEmp;
    }

}
