package com.bits.devops.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping
	public String entry() {
		return "Hello World From Mohit Anand 2021MT93550";
	}
	
	//comment added for force commit

}
