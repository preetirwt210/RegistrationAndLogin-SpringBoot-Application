package com.newproject.springboot.myApp.services;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.newproject.springboot.myApp.model.User;
import com.newproject.springboot.myApp.repository.UserRepository;

@Service
@Transactional
public class UserServices {

      private final UserRepository userRepository;
	public UserServices(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}

	
}
