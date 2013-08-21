package com.jguno.principal;

import com.jguno.jogo.Jogada;

public class Principal {

	private static Construtor tst = new Construtor();
	private static Jogada jogo = new Jogada();
	
	public static void main(String[] args) {
		tst.criarCartas();
		tst.reparteCartas();		
		if(tst.testeMesa()==true){
			jogo.menuJogador();
		}else{
			System.out.println("Erro!!");
		}
	}
}
