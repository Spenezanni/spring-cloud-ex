package com.br.domain;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value;

	public Budget() {
		super();
	}

	public Budget(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
