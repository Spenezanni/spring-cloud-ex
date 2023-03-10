package com.br.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.br.domain.model.Worker;
import com.br.repository.WorkerRepository;
import com.br.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public Worker getWorkerById(Long id) {
		return workerRepository.findById(id).get();
	}



}
