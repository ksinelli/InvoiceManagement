package com.hk.ks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/")
	public String redirectFromMainPage() {
		
		//add ifAuthenticated, redirect to /home, else ifNotAuthenticated, redirect to /login
		return "redirect:/login";
	}
	
	@PostMapping("/home")
	public String displayHomePage() {
		return "home";
	}
	


}
