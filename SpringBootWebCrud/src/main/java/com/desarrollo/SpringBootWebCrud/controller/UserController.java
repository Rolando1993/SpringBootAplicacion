package com.desarrollo.SpringBootWebCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	//http://localhost:8080/
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	//http://localhost:8080/userForm
	@GetMapping("/userForm")
	public String getUserForm() {
		return "user-form/user-view";
	}	
}
