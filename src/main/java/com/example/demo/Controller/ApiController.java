package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	 @Autowired
	  EmployeeRepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getvalues")
	   List<Employee> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/post")
	  public Employee create(@RequestBody Employee emp) {
		 return serviceRepository.save(emp);
	 }
}