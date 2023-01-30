package com.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.domain.model.Payment;
import com.br.service.PaymentProducerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	private final PaymentProducerService paymentProducerService;
	
	@PostMapping
	public ResponseEntity<Void> createProducerPayment(@RequestBody Payment payment) throws Exception  {
		paymentProducerService.sendPayment(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

}
