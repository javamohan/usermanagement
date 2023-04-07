package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Userregister {

	@GetMapping("/userregister")
	public String userRegister() {

		return "User successfully Registered !!";
	}

}
