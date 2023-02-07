package com.br.util.analys;

import java.math.BigDecimal;

import com.br.domain.Budget;
import com.br.util.analys.adapter.StatusBudget;

public class InAnalys extends StatusBudget {
	
	public BigDecimal calculateValueInAnalys(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public void approved(Budget budget) {
		budget.setStatusBudget(new Approved());
	}

	@Override
	public void disapproved(Budget budget) {
		budget.setStatusBudget(new Disapproved());
	}
	
	

}
