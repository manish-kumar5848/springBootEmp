package com.emp_mongo.repository;

import com.emp_mongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeRepository extends MongoRepository<Employee,String> {

}
