package com.emp_mongo.repository.impl;
import com.emp_mongo.repository.EmployeeQueryDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.emp_mongo.model.Employee;
import org.springframework.stereotype.Service;

@Service

public class EmployeeQueryDaoImpl implements EmployeeQueryDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Employee> getAll() {
        System.out.println("Inside Employee Query DAO Impl's get()");
        return mongoTemplate.findAll(Employee.class);

    }
    @Override
    public Employee getEmployeeById(String empId){
        Query query= new Query();
        query.addCriteria(Criteria.where("_id").is(empId));
        return mongoTemplate.findOne(query, Employee.class);
    }
    @Override
    public Employee addEmp(Employee employee){
        mongoTemplate.save(employee);
        return employee;
    }

    @Override
    public void removeEmp(String empId){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(empId));
        mongoTemplate.findAndRemove(query, Employee.class);
    }
}
