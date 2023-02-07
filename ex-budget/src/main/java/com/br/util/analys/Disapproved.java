package com.br.util.analys;

import com.br.domain.Budget;
import com.br.util.analys.adapter.StatusBudget;

public class Disapproved extends StatusBudget {

	@Override
	public void finalize(Budget budget) {
		budget.setStatusBudget(new Finalize());
	}


}	
