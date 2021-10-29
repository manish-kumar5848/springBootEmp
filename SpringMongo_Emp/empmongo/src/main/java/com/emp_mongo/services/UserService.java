package com.emp_mongo.services;


import com.emp_mongo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
     private MongoTemplate mongoTemplate;
    public List<User> getAllUser(){
        return mongoTemplate.findAll(User.class);
    }
    public void addUser(User user){
        mongoTemplate.save(user);
    }
}
