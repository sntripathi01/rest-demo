package com.restdemo.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestServiceController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello(){
		System.out.println("Hello");
		return "Hello";
	}

}
