package com.br.domain.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idUSer;
	private Long idProduct;
	private String cardNumber;
	
}
