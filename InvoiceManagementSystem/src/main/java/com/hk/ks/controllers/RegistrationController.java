package com.hk.ks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hk.ks.services.AccountService;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	AccountService accountService;

	@GetMapping
	public String displayRegistrationForm() {
		return "register";
	}
	
	@PostMapping("/save")
	public String saveNewAccount(@RequestParam("username") String username, 
								 @RequestParam("password") String password) {

		accountService.saveAccount(username, password);

		return "/login";	
	}
}
