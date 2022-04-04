package com.hk.ks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
	
//	public String loginError( ) {
//		return "general-login-error";		
//	}
	
	@GetMapping
	public String handleConstraintViolationException( ) {
		return "/general-registration-error";
	}


}
