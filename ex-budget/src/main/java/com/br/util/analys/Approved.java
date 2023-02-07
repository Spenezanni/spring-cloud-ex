package com.br.util.analys;

import java.math.BigDecimal;

import com.br.domain.Budget;
import com.br.util.analys.adapter.StatusBudget;

public class Approved extends StatusBudget {
	
	public BigDecimal calculateValueInAnalys(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.2"));
	}
	
	@Override
	public void finalize(Budget budget) {
		budget.setStatusBudget(new Finalize());
	}

}
