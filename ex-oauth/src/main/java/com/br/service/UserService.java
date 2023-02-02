package com.br.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.client.UserFeignClient;
import com.br.domain.model.User;


@Service
public class UserService implements UserDetailsService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userClient;
	
	public User findByEmail(@RequestParam String email) {
		User user = userClient.getUserByEmail(email).getBody();
		if(user == null) {
			logger.error("Email not found: {}" + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found: {}" + email);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userClient.getUserByEmail(username).getBody();
		if (user == null) {
			logger.error("Email not found: {}" + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: {}" + username);
		return user;
	}

}
