package com.br.util.analys.adapter;

import java.math.BigDecimal;

import com.br.domain.Budget;
import com.br.exception.DomainException;

public abstract class StatusBudget {
	
	public BigDecimal calculateValueDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	public void approved(Budget budget) {
		throw new DomainException("Budget Approved");
	}
	
	public void disapproved(Budget budget) {
		throw new DomainException("Budget Disapproved");
	}

	public void finalize(Budget budget) {
		throw new DomainException("Budget Finalize");
	}
}
