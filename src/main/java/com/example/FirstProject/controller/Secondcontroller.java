package com.example.FirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to first git";
	}

}
