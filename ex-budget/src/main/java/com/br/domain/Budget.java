package com.br.domain;

import java.math.BigDecimal;

import com.br.util.analys.InAnalys;
import com.br.util.analys.adapter.StatusBudget;

public class Budget {
	
	private BigDecimal value;
	
	private StatusBudget statusBudget;

	public Budget() {
		super();
	}

	public Budget(BigDecimal value) {
		super();
		this.value = value;
		this.statusBudget = new InAnalys();
	}
	
	public void discount() {
		BigDecimal valueDiscount = this.statusBudget.calculateValueDiscount(this);
		this.value = this.value.subtract(valueDiscount);
	}
	
	public void approved() {
		this.statusBudget.approved(this);
	}
	
	public void disapproved() {
		this.statusBudget.disapproved(this);
	}
	
	public void finalize() {
		this.statusBudget.finalize(this);
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public StatusBudget getStatusBudget() {
		return statusBudget;
	}

	public void setStatusBudget(StatusBudget statusBudget) {
		this.statusBudget = statusBudget;
	}

}
