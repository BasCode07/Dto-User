package com.bascode.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bascode.repository.LocationRepository;
import com.bascode.repository.UserRepository;


@Component
public class InitializerCommandline implements CommandLineRunner{
		@Autowired
		private UserRepository userRepo;
		
		@Autowired
		private LocationRepository locationRepo;
		
		
		
		
	@Override
	public void run(String... args) throws Exception {
		
		
		Location location = new Location();
		location.setAddress(List.of("no3 egbeda Lagos","Nigeria"));
		location.setPlace("Lagos");
		location.setDescription("the most purpulated city in Nigeria");
		location.setLatitude(47.4);
		location.setLongitude(57.8);
		locationRepo.save(location);
		
		
		User user = new User();
		user.setUserName("bascode-dev");
		user.setTech(List.of("java","springboot","javascript","mysql"));
		user.setUserEmail("samson@gmail.com");
		user.setPassword("345spg10");
		user.setLocation(location);
		userRepo.save(user);
		
	}
	
	
	
	
	
	
	
	
	
	

}
