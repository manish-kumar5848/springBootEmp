package com.emp_mongo.services;

import com.emp_mongo.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    //List<Employee> getEmployeeByName(String firstName);
    Employee getEmployeeById(String empId);
    public Employee addEmployee(Employee emp);
    void removeEmployee(String empId);
    void updateEmployee( Employee updatedEmp, String id);
}