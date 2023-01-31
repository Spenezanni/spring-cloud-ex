package com.br.util.rateTypes;

import java.math.BigDecimal;

import com.br.domain.Budget;
import com.br.service.RateService;

public class RateTypeA implements RateService {

	@Override
	public BigDecimal calculateRate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

}
