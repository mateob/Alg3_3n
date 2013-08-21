package com.jguno.principal;

import com.jguno.jogo.menuJogo;

public class Principal {

	private static Construtor tst = new Construtor();
	private static menuJogo jogo = new menuJogo();
	
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
