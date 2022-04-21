package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping(value="/reg" ,method=RequestMethod.POST)
	public Student registration(@RequestBody Student s) 
	{
		hs.savedata(s);
		System.out.println("Register Succesfull");
		//s.setName("nikhilUpdated");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getUsername());
		System.out.println(s.getPassword());
		
		return s;

	}

}
