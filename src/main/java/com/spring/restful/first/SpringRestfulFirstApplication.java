package com.spring.restful.first;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.restful.first.entity.Employee;
import com.spring.restful.first.repository.EmployeeRepository;

@SpringBootApplication
public class SpringRestfulFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulFirstApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository repository;
	
	@Bean
	public CommandLineRunner initiateEmployee (ApplicationContext ctx){
		return args -> {
			Employee e = new Employee();
			
			e.setFirstName("ali");
			e.setLastName("ghifari");
			e.setDob(new Date());
			e.setGender("male");
			
			repository.save(e);
		};
	}
}
