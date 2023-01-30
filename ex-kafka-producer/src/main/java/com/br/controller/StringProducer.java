package com.br.controller;

import com.br.service.StringProducerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/producer")
public class StringProducer {
	
    private final StringProducerServices producerServices;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message){
        producerServices.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
