package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class SpringDataPagingSortingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataPagingSortingApplication.class, args);
	}
	
	@Autowired
	EmployeeRepository er;
	
	@Override
	public void run(String... args) throws Exception {
		
		er.save(new Employee("tanvi10","abc"));
		er.save(new Employee("tanvi2","sdfgabc"));
		er.save(new Employee("tanvi3","ewrabc"));
		
		er.save(new Employee("tanvi4","fgxyz"));
		er.save(new Employee("tanvi5","dfgxyz"));
		er.save(new Employee("xytanvi10","dfgabc"));
		
		er.save(new Employee("astanvi2","abc"));
		er.save(new Employee("sdtanvi3","abc"));
		er.save(new Employee("sdtanvi4","xyz"));
		
		er.save(new Employee("astanvi5","xyz"));
		
		System.out.println("\n\n\n");
		System.out.println(er.findByHobbyOrderByName("abc"));
		System.out.println("\n");
		System.out.println(er.findAll(Sort.by(Sort.Direction.DESC, "hobby")));
		System.out.println("\n"+er.findAllByOrderByName());
		System.out.println("\n"+er.myOrdering());
		System.out.println("\n\n----------------------------------------------");
		
		Page<Employee> page = er.findAll(PageRequest.of(0,3,Sort.Direction.ASC,"hobby"));
		System.out.println(page+"\n");
		System.out.println(page.getContent());
		System.out.println("total pages "+page.getTotalPages());
	}

}
