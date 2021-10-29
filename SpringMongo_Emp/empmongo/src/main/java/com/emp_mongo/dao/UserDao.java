package com.emp_mongo.dao;

import com.emp_mongo.model.DAOUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends MongoRepository<DAOUser, String> {
    Optional<DAOUser> findByUsername(String username);

}
