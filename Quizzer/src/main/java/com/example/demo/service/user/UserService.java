package com.example.demo.service.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user.Role;
import com.example.demo.model.user.User;
import com.example.demo.model.user.UserRole;
import com.example.demo.repository.user.RoleRepository;
import com.example.demo.repository.user.UserRepository;
import com.example.demo.repository.user.UserRoleRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserRoleRepository userRoleRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
		
	}
	public void saveUserRole(UserRole userRole) {
		userRoleRepository.save(userRole);
		
	}
	public void saveRole(Role role) {
		roleRepository.save(role);
		
	}

}
