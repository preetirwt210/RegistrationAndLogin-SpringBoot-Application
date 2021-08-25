package com.newproject.springboot.myApp.repository;

import org.springframework.data.repository.CrudRepository;
import com.newproject.springboot.myApp.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}
