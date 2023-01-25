package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.domain.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

	
}
