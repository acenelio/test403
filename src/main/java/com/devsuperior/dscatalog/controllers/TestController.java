package com.devsuperior.dscatalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public String testGet() {
		return "Test";
	}

	@PostMapping(value = "/test")
	public String testPost() {
		return "Test";
	}
} 
