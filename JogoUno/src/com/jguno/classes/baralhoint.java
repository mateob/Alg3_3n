package com.jguno.classes;

public interface baralhoint<T extends Object> {
	
	void insercao (T valor);
	
	T obter();
	
	T remocao();
	
	boolean vazia();
	
	int tamanho();
	
	void ezvaziar();
}
