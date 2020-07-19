package com.example.springauthenticationexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	@GetMapping("/getMsg")
	public String greeting(){
		return "spring security";
	}
	@GetMapping("/")
	public String homePage(){
		return "successfuly logged in";
	}
}
