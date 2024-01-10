package com.example.sample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SampleRepository2 extends CrudRepository<Employee ,Integer>{

}
