package com.snapup.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.snapup.model.User;
import com.snapup.service.IUsersService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	IUsersService userService;
	
	@RequestMapping(value="userbyid/{id}", method=RequestMethod.GET)
	public User getUserById(@PathVariable int id) {
		
		System.out.println("**********id**************"+id);
		
		return userService.getUserById(id);
	}
	
	
	
	

}
