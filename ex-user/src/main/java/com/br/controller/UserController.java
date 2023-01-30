package com.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.domain.model.Role;
import com.br.domain.model.User;
import com.br.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		return ResponseEntity.ok(userServiceImpl.getUserById(id));
	}
	
	@GetMapping("role/{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
		return ResponseEntity.ok(userServiceImpl.getRoleById(id));
	}
	

}
