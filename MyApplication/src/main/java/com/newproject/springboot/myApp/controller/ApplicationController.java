package com.newproject.springboot.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

   
@Controller
public class ApplicationController {
	    
	    @RequestMapping("/welcome")
	    public String welcome() {
	    	return "welcomepage";
	    }
	}
