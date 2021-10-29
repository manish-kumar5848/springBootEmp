package com.emp_mongo.controllers;

import com.emp_mongo.model.User;
import com.emp_mongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControlller {
    @Autowired
    UserService userService;

    @GetMapping("/user")
   public List<User> getusers(){
       return this.userService.getAllUser();
    }
    @PostMapping("/user")
    public void addUser(@Valid @RequestBody User user){
        this.userService.addUser(user);
    }


}
