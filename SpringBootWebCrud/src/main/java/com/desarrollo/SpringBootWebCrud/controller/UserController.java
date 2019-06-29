package com.desarrollo.SpringBootWebCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desarrollo.SpringBootWebCrud.entity.User;
import com.desarrollo.SpringBootWebCrud.repository.RolRepository;
import com.desarrollo.SpringBootWebCrud.service.UserService;

@Controller
public class UserController {

	@Autowired
	RolRepository roleRepository;
	
	@Autowired 
	UserService userService;
	
	//http://localhost:8080/
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*//http://localhost:8080/userForm
	@GetMapping("/userForm")
	public String getUserForm() {
		return "user-form/user-view";
	}*/
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
}
