package com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
public class ExKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExKafkaProducerApplication.class, args);
	}

}
