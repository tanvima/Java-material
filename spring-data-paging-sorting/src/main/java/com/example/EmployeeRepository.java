package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByHobbyOrderByName(String hobby);
	public List<Employee> findAllByOrderByName();
	
	@Query(nativeQuery = true,value = "select * from emplsort order by name desc")
	public List<Employee> myOrdering();

	
}
