package com.cjc.main.serviceImpli;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repositry.HomeReposistory;
import com.cjc.main.service.HomeService;

@Service
public class ServiceImpli implements HomeService
{
   @Autowired
   HomeReposistory hr;
   
   
   
	@Override
	public void savedata(Student s) 
	{
		hr.save(s);
		
	}

	

}
