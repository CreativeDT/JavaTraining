package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SampleService {
@Autowired
Employee employee;
@Autowired
SampleRepository sampleRepository;
    public String add(Employee emp) {
       this.employee=emp;
       System.out.println("emp id :" +emp.getId());
         sampleRepository.save(emp);
         return "Employee added successfully";
    }
    
    public String delete(Employee emp) {
    	sampleRepository.delete(emp);
    	return "row deleted";
    }

}
