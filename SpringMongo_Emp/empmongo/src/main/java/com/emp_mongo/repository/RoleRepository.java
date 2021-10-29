package com.emp_mongo.repository;


import com.emp_mongo.model.ERole;
import com.emp_mongo.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}