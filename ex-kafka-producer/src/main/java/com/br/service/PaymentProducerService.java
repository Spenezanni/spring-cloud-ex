package com.br.service;

import java.io.Serializable;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.br.domain.model.Payment;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor  	
@Service
public class PaymentProducerService {
	
	private final KafkaTemplate<String, Serializable>  kafkaTemplate;
	
	public void sendPayment(Payment payment) throws InterruptedException {
		log.info("Pagamento Recebido :::: {}", payment);
		Thread.sleep(1000);
		log.info("Sending Payment :::: ");
		kafkaTemplate.send("payment-ex-topic", payment);
	}

}
