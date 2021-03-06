package com.microservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {
	
	@RequestMapping(path = "/helloWorld", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String testController() {
		return "Hello World !!";
	}
	
	@RequestMapping(path = "/getName", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String printName() {
		return "Heleeu Tejas! This is the change made to the branch";
	}

}
