package com.tecnotab.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.frontend.dao.UserRepository;
import com.tecnotab.frontend.model.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/userslist")
	public List<User> listOfUsers() {
		
		return userRepo.findAll();
		
	}

}
