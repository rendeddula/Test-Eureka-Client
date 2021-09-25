package com.manh.gms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	@GetMapping("/test")
	public String helloTest() {
		return "Hello-Eureka-Client-1";
	}
	

}
