package com.emp_mongo.repository.impl;
import com.emp_mongo.model.Employee;
import com.emp_mongo.repository.EmployeeQueryDao;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public UpdateResult updateEmp(Employee Emp, String Id) {
        Employee updatedEmp = new Employee();
        updatedEmp.setEmpId(Emp.getEmpId());
        updatedEmp.setEmp_dept(Emp.getEmp_dept());
        updatedEmp.setEmail(Emp.getEmail());
        updatedEmp.setMobile(Emp.getMobile());
        updatedEmp.setSalary(Emp.getSalary());
        updatedEmp.setName(Emp.getName());


        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(Id));

        Document doc = new Document(); // org.bson.Document
        mongoTemplate.getConverter().write(updatedEmp, doc);
//        Update update = Update.fromDocument(doc);
        Update update = fromDBObjectExcludeNullFields(doc);
       return mongoTemplate.upsert(query,update,Employee.class);

    }
    //return Update object
    public static Update fromDBObjectExcludeNullFields(Document object) {
        Update update = new Update();
        for (String key : object.keySet()) {
            Object value = object.get(key);
            if(value!=null){
                update.set(key, value);
            }
        }
        return update;
    }




    @Override
    public void removeEmp(String empId){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(empId));
        mongoTemplate.findAndRemove(query, Employee.class);
    }
}
