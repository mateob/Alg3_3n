package com.jguno.jogadores;

public interface jogadoresint<T extends Object> {
	
	void addFin (T valor);
	
	void addIni (T valor);
	
	void addPos (int posicao, T valor);
	
	T obterPrimeiro();
	
	T obterUltimo();
	
	T obterPosicao (int posicao);
	
	int obterTamanho();
	
	T removerPosicao (int posicao);
	
	void esvaziar();
}
