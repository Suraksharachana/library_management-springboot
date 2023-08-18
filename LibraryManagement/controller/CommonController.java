package com.bootproject.LibraryManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
  
	@GetMapping({"/","/home"})
	public String goToHome() {
		return "Home";
	}
	
	@GetMapping("/student/login")
	public String goToLogin() {
		return "Login";
	}
	
	@GetMapping("/signup")
	public String goToSignup() {
		return "Signup";
	}
}
