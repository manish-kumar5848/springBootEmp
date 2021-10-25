package com.manishk.manishk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
@SpringBootApplication
@EnableWebMvc
public class ManishkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManishkApplication.class, args);
	}

}
