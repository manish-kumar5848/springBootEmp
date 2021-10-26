package com.emp_mongo.emp_mongo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.emp_mongo.model.Employee;
import com.emp_mongo.repository.EmployeeQueryDao;
@Configuration
@ComponentScan(basePackages = "com")
@SpringBootApplication
@EnableWebMvc
public class EmpmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpmongoApplication.class, args);
	}

}
