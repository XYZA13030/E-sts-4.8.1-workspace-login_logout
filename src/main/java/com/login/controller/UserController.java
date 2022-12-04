package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.entities.User;
import com.login.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@RequestMapping("/")
	public String viewHomePage() {
		return "home";
	}
	
	@RequestMapping("/showReg")
	public String  showRegistrationPage() {
		
		return "login/registerUser";
		
	}
	
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.saveUser(user);
		return "login/registerUser";
		
	}

	
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
