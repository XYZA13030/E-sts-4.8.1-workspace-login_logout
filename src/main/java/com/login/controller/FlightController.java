package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FlightController {

	@RequestMapping("/addFlight")
	public String showAddFlight() {
		
		return "addFlight";
	}
}
