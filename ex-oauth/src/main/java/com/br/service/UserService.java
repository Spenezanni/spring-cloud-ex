package com.br.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.client.UserFeignClient;
import com.br.domain.model.User;


@Service
public class UserService {
	
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

}
