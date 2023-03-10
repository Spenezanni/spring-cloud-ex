package com.br.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.domain.model.Worker;
import com.br.service.impl.WorkerServiceImpl;

@RestController
@RequestMapping("/workers")
public class WorkerController {

	@Autowired
	private WorkerServiceImpl workerServiceImpl;
	
	@GetMapping("/{id}")
	public ResponseEntity<Worker> getWorkerById(@PathVariable Long id) {
		return ResponseEntity.ok(workerServiceImpl.getWorkerById(id));
	}
}
