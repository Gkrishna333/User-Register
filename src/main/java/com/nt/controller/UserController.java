package com.nt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.UserDTO;
import com.nt.service.IUserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping("/create")
	public UserDTO createUser( @Valid @RequestBody UserDTO entity) {
		UserDTO user = this.service.createUser(entity);
		return user;
	}
	
	@GetMapping("/get")
	public UserDTO get() {
		return new  UserDTO();
	}
	
	

}
