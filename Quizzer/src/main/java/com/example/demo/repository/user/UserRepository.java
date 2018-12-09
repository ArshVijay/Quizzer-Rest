package com.example.demo.repository.user;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.user.User;



public interface UserRepository extends CrudRepository<User, Long> {

}
