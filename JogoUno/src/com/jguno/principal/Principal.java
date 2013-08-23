package com.jguno.principal;

public class Principal {

	@SuppressWarnings("rawtypes")
	private static Construtor tst = new Construtor();
	
	public static void main(String[] args) {
		tst.criarCartas();
		tst.reparteCartas();
		if(tst.testeMesa()==true){
			tst.iniciarJogo();
		}else{
			System.err.println("Erro: não foi possivel carregar o sistema!");
		}
	}
}
