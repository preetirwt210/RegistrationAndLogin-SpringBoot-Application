package com.newproject.springboot.myApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newproject.springboot.myApp.model.User;
import com.newproject.springboot.myApp.services.UserServices;

@org.springframework.web.bind.annotation.RestController

public class RestController {

	@Autowired
	private UserServices userServices;
	
	@GetMapping("/")
	public String hello() {
		return " This is homePage";
	}
	
	@GetMapping("/user-saved")
	public String saveUser(@RequestParam String userName,@RequestParam String firstName,@RequestParam String lastName
			,@RequestParam int age,@RequestParam String password ) {
		
		User user=new User(userName,firstName,lastName,age,password);
		userServices.saveMyUser(user);
		return "User Saved";
	}
}
