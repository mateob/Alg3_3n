package com.jguno.jogo;

import com.jguno.classes.mesa;
import com.jguno.classes.mesaFactory;
import com.jguno.principal.Construtor;

public class Pontuação<T>{
	
	public mesa<T> cartaMesa = mesaFactory.getInstanciaMesa().criarMes();
	@SuppressWarnings("rawtypes")
	//private Construtor construtor = new Construtor();
	
	public void teste(){
		System.out.println("mostra carta na mesa!");
	}
}
