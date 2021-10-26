package com.emp_mongo.services;

import java.util.List;

import com.emp_mongo.model.Employee;

public interface EmployeeService {

    List<Employee> getAll();

    //List<Employee> getEmployeeByName(String firstName);
    Employee getEmployeeById(String empId);
    public Employee addEmployee(Employee emp);
    void removeEmployee(String empId);
}