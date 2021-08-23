package com.newproject.springboot.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

   
	@Controller
	public class ApplicationController {
	
	    @ResponseBody
		@RequestMapping("/sayHello")
		public static String sayHello() {
			
			return "hello, Preeti!! Hope You are well";
		}
	}
