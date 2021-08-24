package com.newproject.springboot.myApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newproject.springboot.myApp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
