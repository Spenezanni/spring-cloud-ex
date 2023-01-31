package com.br.service;

import java.math.BigDecimal;

import com.br.domain.Budget;

public interface RateService {
	
	BigDecimal calculateRate(Budget budget);

}
