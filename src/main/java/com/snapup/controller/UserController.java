package com.snapup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
	
	@RequestMapping(value="user/by/{id}", method=RequestMethod.GET)
	public String getUserById(@PathVariable int id) {
		
		System.out.println("**********id**************"+id);
		
		return "user returned";
	}
	
	
	
	

}
