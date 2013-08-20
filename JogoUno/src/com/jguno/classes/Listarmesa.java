package com.jguno.classes;

import com.jguno.jogadores.jogadoresint;
import com.jguno.nodo.nodoMesa;

public class Listarmesa<T> implements jogadoresint<T>{

	private nodoMesa<T> inicio = new nodoMesa<T>();
	
	@Override
	public void addFin(T valor) {
		addPos(obterTamanho(), valor);
	}

	@Override
	public void addIni(T valor) {
		addPos(0,valor);
	}

	@Override
	public void addPos(int posicao, T valor) {
		nodoMesa<T> nodo = null;
		nodoMesa<T> nodoNovo = new nodoMesa<T>();
		if(valor == null){
			throw new IllegalArgumentException();
		}
		if(posicao < 0){
			throw new IllegalArgumentException();
		}
		if(posicao > obterTamanho()){
			throw new IllegalArgumentException();
		}
		nodo = obterNodoPosicao(posicao -1);
		nodoNovo.proximo = nodo.proximo;
		nodo.proximo = nodoNovo;
		nodoNovo.conteudo = valor;
	}

	@Override
	public T obterPrimeiro() {
		nodoMesa<T> nodo = null;
		if(obterNodoPosicao(0) == null){
			throw new IllegalArgumentException();
		}
		nodo = obterNodoPosicao(0);
		return nodo.conteudo;
	}

	@Override
	public T obterUltimo() {
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho -1);
		return resultado;
	}

	@Override
	public T obterPosicao(int posicao) {
		nodoMesa<T> nodo = null;
		if(posicao < 0 ){
			throw new IllegalArgumentException();
		}
		if(posicao >= obterTamanho()){
			throw new IllegalArgumentException();
		}
		nodo = obterNodoPosicao(posicao);
		return nodo.conteudo;
	}

	@Override
	public int obterTamanho() {
		int resultado = 0;
		nodoMesa<T> nodo = null;
		nodo = inicio;
		while(nodo.proximo != null){
			nodo = nodo.proximo;
			resultado++;
		}
		
		return resultado;
	}

	@Override
	public T removerPosicao(int posicao) {
		nodoMesa<T> nodo = null;
		nodoMesa<T> nodoAnterior = null;
		if(posicao < 0 ){
			throw new IllegalArgumentException();
		}
		if(posicao >= obterTamanho()){
			throw new IllegalArgumentException();
		}
		nodo = obterNodoPosicao(posicao);
		nodoAnterior = obterNodoPosicao(posicao -1);
		nodoAnterior.proximo = nodo.proximo;
		nodo.proximo = null;
		T resultado = nodo.conteudo;
		return resultado;
	}

	@Override
	public void esvaziar() {
		this.inicio.proximo = null;
	}
	
	private nodoMesa<T> obterNodoPosicao(int posicao){
		nodoMesa<T> nodo = inicio;
		int indice = -1;
		while(posicao != indice){
			nodo = nodo.proximo;
			indice++;
		}
		return nodo;
	}
}
