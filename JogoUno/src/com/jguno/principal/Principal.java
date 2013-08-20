package com.jguno.principal;

public class Principal {

	private static Construtor tst = new Construtor();
	
	public static void main(String[] args) {
		tst.criarCartas();
		System.out.println("teste 1 ok");
		tst.reparteCartas();
		System.out.println("teste 2 ok");
	}
}
