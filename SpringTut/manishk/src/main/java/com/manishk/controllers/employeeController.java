package com.manishk.controllers;

import com.manishk.model.Employee;
import com.manishk.services.EmployeeService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class employeeController {
    @Autowired
    // @RequestMapping(value = "/employees",method = RequestMethod.GET)
    private EmployeeService employee;
    @GetMapping("/emp")
    public List<Employee> getEmployees() {
        System.out.println("getempHit");
        return this.employee.getallEmployee();
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return this.employee.getEmployeeById(id);
    }
    @PostMapping("/emp")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee emp =this.employee.addEmployee(employee);
        return emp;

    }
    @DeleteMapping("/emp/{employeeId}")
    public void removeEmployee(@PathVariable("employeeId") int employeeId){
        this.employee.removeEmployee(employeeId);
    }
    ///update employee
    @PutMapping("/emp/{id}")
    public Employee updateEmployee(@RequestBody Employee updatedEmp,@PathVariable("id") int id){
        this.employee.updateEmployee(updatedEmp,id);
        return  updatedEmp;
    }
    
}
