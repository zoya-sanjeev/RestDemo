package com.bridgelabz.myfirstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellocontroller")
public class HelloWorldController {
	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "Hello World!";
	}

}
