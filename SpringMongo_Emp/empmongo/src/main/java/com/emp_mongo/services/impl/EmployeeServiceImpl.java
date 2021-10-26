package com.emp_mongo.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp_mongo.model.Employee;
import com.emp_mongo.repository.EmployeeQueryDao;
import com.emp_mongo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeQueryDao employeeQueryDao;

    @Override
    public List<Employee> getAll() {
        return employeeQueryDao.getAll();
    }
    @Override
    public Employee getEmployeeById(String empId) {
        return employeeQueryDao.getEmployeeById(empId);
    }
    @Override
    public Employee addEmployee(Employee emp){
        return employeeQueryDao.addEmp(emp);
    }
    @Override
    public void removeEmployee(String empId){
        this.employeeQueryDao.removeEmp(empId);
    }
}
