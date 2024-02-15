package com.bascode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bascode.dto.UserLocationDTO;
import com.bascode.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserLocationDTOController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/location")
	public ResponseEntity<List<UserLocationDTO>> userLocation(){
		return ResponseEntity.ok(userServiceImpl.userLocation());
	}

}
