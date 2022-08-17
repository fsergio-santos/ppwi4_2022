package com.projeto.models.services.execption;

public class EntidadeNaoEncontrada extends RuntimeException{

	private static final long serialVersionUID = -2047206962233572584L;
	
	public EntidadeNaoEncontrada(String mensagem) {
		super(mensagem);
	}

}
