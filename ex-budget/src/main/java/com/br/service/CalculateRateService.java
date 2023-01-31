package com.br.service;

import java.math.BigDecimal;

import com.br.domain.Budget;

public interface CalculateRateService {
	
	BigDecimal calculateRate(Budget budget, RateService rateService);

}
