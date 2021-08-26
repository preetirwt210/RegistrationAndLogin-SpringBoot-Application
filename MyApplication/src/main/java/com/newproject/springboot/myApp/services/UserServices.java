package com.newproject.springboot.myApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	public void deleteMyUser(int id) {
		userRepository.deleteById(id);
	}
	
	public User editUser(int id) {
		Optional<User> result=userRepository.findById(id);
		User user = null;
		
				if(result.isPresent()){
					user=result.get();
				}else {
					throw new RuntimeException("Did not find user id: " + id);
				}
				return user;

	}
	
	public User findByUserNameAndPassword(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName, password);
	}
	
}
