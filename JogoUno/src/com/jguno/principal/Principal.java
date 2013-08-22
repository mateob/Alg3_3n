package com.jguno.principal;

public class Principal {

	@SuppressWarnings("rawtypes")
	private static Construtor tst = new Construtor();
	
	public static void main(String[] args) {
		tst.criarCartas();
		tst.reparteCartas();
		if(tst.testeMesa()==true){
			//tst.testeIgual();
			tst.iniciarJogo();
		}else{
			System.out.println("Erro!!");
		}
	}
}
