package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	Employee employee;

	@Autowired
	SampleService sampleService;

	@PostMapping("/add")
	public String addUser(@RequestBody  Employee employee) {
		System.out.println("addUser(-)");
		return sampleService.add(employee);
	}
	

	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody  Employee employee) {
		System.out.println("addUser(-)");
		return sampleService.delete(employee);
	}
}