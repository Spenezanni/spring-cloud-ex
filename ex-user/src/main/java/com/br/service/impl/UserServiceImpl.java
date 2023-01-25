package com.br.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.domain.model.Role;
import com.br.domain.model.User;
import com.br.repository.RoleRepository;
import com.br.repository.UserRepository;
import com.br.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	public Role getRoleById(Long id) {
		return roleRepository.findById(id).get();
	}
	
}
