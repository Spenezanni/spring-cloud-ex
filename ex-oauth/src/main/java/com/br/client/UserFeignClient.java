package com.br.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.domain.model.User;

@Component
@FeignClient(name="ex-user", path="/users")
public interface UserFeignClient {
	
	@GetMapping(value = "/search")
	ResponseEntity<User> getUserByEmail(@RequestParam String email);

}
