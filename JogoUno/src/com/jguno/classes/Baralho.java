package com.jguno.classes;

public class Baralho<T> implements baralhoint<T> {

	private Listacarta<T> lista = new Listacarta<T>();
	
	@Override
	public void insercao(T valor) {
		lista.addPos(0, valor);
	}

	@Override
	public T obter() {
		return lista.obterPosicao(0);
	}

	@Override
	public T remocao() {
		return lista.removerPosicao(0);
	}

	@Override
	public boolean vazia() {
		boolean resultado = false;
		if(lista.obterTamanho() <= 0){
			resultado = true;
		}
		return resultado;
	}

	@Override
	public int tamanho() {
		return lista.obterTamanho();
	}

	@Override
	public void ezvaziar() {
		lista.esvaziar();
	}
}
