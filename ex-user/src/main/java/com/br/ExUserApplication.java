package com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableEurekaClient
@SpringBootApplication
public class ExUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExUserApplication.class, args);
	}

}
