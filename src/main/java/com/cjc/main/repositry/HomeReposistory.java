package com.cjc.main.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeReposistory extends CrudRepository<Student, Integer>
{

	

	
   
}
