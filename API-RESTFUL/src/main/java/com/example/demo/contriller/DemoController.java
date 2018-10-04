package com.example.demo.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServicePerson;

@RestController
public class DemoController
{
	@Autowired
	private ServicePerson serviceperson;
	
	
@RequestMapping(value="/getPersonData",method=RequestMethod.GET)
public ServicePerson getPersonData() 
{
	serviceperson.setId("1");
	serviceperson.setName("Tilahun");
	serviceperson.setAge("30");
	serviceperson.setHeight("165cm");
	
	return serviceperson;
	
	
}
}
