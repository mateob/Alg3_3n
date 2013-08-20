package com.jguno.principal;

public class Principal {

	private static Construtor tst = new Construtor();
	
	public static void main(String[] args) {
		tst.criarCartas();
		tst.reparteCartas();
		if(tst.testeMesa()==true){
			System.out.println("Ok");
		}else{
			System.out.println("Erro!!");
		}
	}
}
