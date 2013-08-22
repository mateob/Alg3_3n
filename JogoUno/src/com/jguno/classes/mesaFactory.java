package com.jguno.classes;

public class mesaFactory {
	
	private static final mesaFactory instancia = new mesaFactory();
	
	private mesaFactory(){
		
	}
	
	public <T> mesa<T> criarMes(){
		mesa<T> resultado = null;
		resultado = new mesa<T>();
		return resultado;
	}
	
	public static mesaFactory getInstanciaMesa(){
		return instancia;
	}
}
