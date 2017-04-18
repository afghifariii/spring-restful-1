package com.spring.restful.first.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.spring.restful.first.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	
	public List<Employee> findByLastName (@Param(value="lastName") String lastName);
	
	public List<Employee> findByFirstNameAndLastName (@Param(value="firstName") String firstName
													,@Param(value="lastName") String lastName);

}
