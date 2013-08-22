package com.jguno.classes;

public class baralhoFactory {
	private static final baralhoFactory instancia = new baralhoFactory();
	
	private baralhoFactory(){
		
	}
	
	public <T> Baralho<T> criarBaralho(){
		Baralho<T> resultado = null;
		resultado = new Baralho<T>();
		return resultado;
	}
	
	public static baralhoFactory getInstanciaBaralho(){
		return instancia;
	}
	
	

}
