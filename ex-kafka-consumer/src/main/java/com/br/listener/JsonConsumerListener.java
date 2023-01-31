package com.br.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.br.domain.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Component
public class JsonConsumerListener {

	@SneakyThrows
	@KafkaListener(topics = "payment-ex-topic", groupId = "valid-payment", containerFactory = "jsonContainerFactory")
	public void validePayment(@Payload Payment payment) {
		log.info("Received Payment {}", payment.toString());
		Thread.sleep(2000);
		log.info("Validing Payment :::: ");
		Thread.sleep(2000);
		log.info("Payment Aproved");
		Thread.sleep(2000);
	}

	@SneakyThrows
	@KafkaListener(topics = "payment-ex-topic", groupId = "pdf-payment", containerFactory = "jsonContainerFactory")
	public void pdfGeneratorPayment(@Payload Payment payment) {
		log.info("Generating Payment :::: ID {} ", payment.getId());
		Thread.sleep(2000);
		log.info("Payment Generated");
		Thread.sleep(3000);
	}

	@SneakyThrows
	@KafkaListener(topics = "payment-ex-topic", groupId = "email-payment", containerFactory = "jsonContainerFactory")
	public void emailPayment() {
		log.info("Sending Payment :::: ");
	}

}
