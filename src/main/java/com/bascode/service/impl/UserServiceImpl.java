package com.bascode.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bascode.dto.UserLocationDTO;
import com.bascode.model.User;
import com.bascode.repository.UserRepository;
import com.bascode.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<UserLocationDTO> userLocation() {
		return userRepo.findAll()
			.stream()
			.map(this::convertToUserDTO)
			.collect(Collectors.toList());
		
	}
	
	private UserLocationDTO convertToUserDTO(User user) {
		UserLocationDTO userLocation = new UserLocationDTO();
		userLocation.setUserId(user.getId());
		userLocation.setUserName(user.getUserName());
		userLocation.setPlace(user.getLocation().getPlace());
		userLocation.setDescription(user.getLocation().getDescription());
		userLocation.setAddr(user.getLocation().getAddress());
		userLocation.setLogit(user.getLocation().getLongitude());
		userLocation.setLati(user.getLocation().getLatitude());
		return userLocation;
	}

}
