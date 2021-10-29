package com.emp_mongo.repository;

import com.emp_mongo.model.Employee;
import com.mongodb.client.result.UpdateResult;

import java.util.List;

public interface EmployeeQueryDao {
    List<Employee> getAll();

    //List<Employee> getEmployeeByName(String firstName);
    Employee getEmployeeById(String empId);
    Employee addEmp(Employee emp);
    UpdateResult updateEmp(Employee Emp, String Id);
    void removeEmp(String empId);
}
