package com.qiliu.springcloud.simplesocialmediaapplicationserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
     
	@GetMapping("/hello")
	public String greetings() {
		return "Hello!";
	}
}
